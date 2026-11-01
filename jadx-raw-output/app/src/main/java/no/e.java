package no;

import com.ironsource.Z7;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;

/* JADX INFO: compiled from: DatagramProcessorImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class e implements po.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f64893a = Logger.getLogger(po.d.class.getName());

    /* JADX WARN: Type inference failed for: r1v0, types: [pn.d] */
    @Override // po.d
    public DatagramPacket a(org.fourthline.cling.model.message.a aVar) throws UnsupportedDataException {
        StringBuilder sb2 = new StringBuilder();
        ?? K = aVar.k();
        if (K instanceof UpnpRequest) {
            sb2.append(((UpnpRequest) K).c());
            sb2.append(" * ");
            sb2.append("HTTP/1.");
            sb2.append(K.a());
            sb2.append("\r\n");
        } else {
            if (!(K instanceof UpnpResponse)) {
                throw new UnsupportedDataException("Message operation is not request or response, don't know how to process: " + aVar);
            }
            UpnpResponse upnpResponse = (UpnpResponse) K;
            sb2.append("HTTP/1.");
            sb2.append(K.a());
            sb2.append(Z7.f27998r);
            sb2.append(upnpResponse.d());
            sb2.append(Z7.f27998r);
            sb2.append(upnpResponse.e());
            sb2.append("\r\n");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) sb2);
        sb3.append(aVar.j().toString());
        sb3.append("\r\n");
        if (f64893a.isLoggable(Level.FINER)) {
            f64893a.finer("Writing message data for: " + aVar);
            f64893a.finer("---------------------------------------------------------------------------------");
            f64893a.finer(sb3.toString().substring(0, sb3.length() + (-2)));
            f64893a.finer("---------------------------------------------------------------------------------");
        }
        try {
            byte[] bytes = sb3.toString().getBytes(C.ASCII_NAME);
            f64893a.fine("Writing new datagram packet with " + bytes.length + " bytes for: " + aVar);
            return new DatagramPacket(bytes, bytes.length, aVar.u(), aVar.v());
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedDataException("Can't convert message content to US-ASCII: " + e10.getMessage(), e10, sb3);
        }
    }

    @Override // po.d
    public pn.b b(InetAddress inetAddress, DatagramPacket datagramPacket) throws UnsupportedDataException {
        try {
            if (f64893a.isLoggable(Level.FINER)) {
                f64893a.finer("===================================== DATAGRAM BEGIN ============================================");
                f64893a.finer(new String(datagramPacket.getData(), "UTF-8"));
                f64893a.finer("-===================================== DATAGRAM END =============================================");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datagramPacket.getData());
            String[] strArrSplit = ro.a.j(byteArrayInputStream).split(Z7.f27998r);
            return strArrSplit[0].startsWith("HTTP/1.") ? d(inetAddress, datagramPacket, byteArrayInputStream, Integer.valueOf(strArrSplit[1]).intValue(), strArrSplit[2], strArrSplit[0]) : c(inetAddress, datagramPacket, byteArrayInputStream, strArrSplit[0], strArrSplit[2]);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Could not parse headers: " + e10, e10, datagramPacket.getData());
        }
    }

    public pn.b c(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, String str, String str2) throws Exception {
        pn.c cVar = new pn.c(byteArrayInputStream);
        UpnpRequest upnpRequest = new UpnpRequest(UpnpRequest.Method.getByHttpName(str));
        upnpRequest.b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        pn.b bVar = new pn.b(upnpRequest, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.t(cVar);
        return bVar;
    }

    public pn.b d(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, int i10, String str, String str2) throws Exception {
        pn.c cVar = new pn.c(byteArrayInputStream);
        UpnpResponse upnpResponse = new UpnpResponse(i10, str);
        upnpResponse.b(str2.toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
        pn.b bVar = new pn.b(upnpResponse, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        bVar.t(cVar);
        return bVar;
    }
}
