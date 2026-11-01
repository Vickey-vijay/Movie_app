package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class U9 {

    public class a extends GZIPOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OutputStream outputStream, int i10) throws IOException {
            super(outputStream);
            this.f27750a = i10;
            if (i10 < 0 || i10 > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i10);
        }
    }

    public static byte[] a(String str, int i10) throws Exception {
        byte[] byteArray = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i10);
            aVar.write(str.getBytes());
            aVar.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (OutOfMemoryError e10) {
            C3676r4.d().a(e10);
            String str2 = "Error while compressing:" + e10.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return byteArray;
        }
    }

    private static void b(String str) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.U().q().a(new C5(D5.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObjectJsonObjectInit));
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("exception while decompressing " + e10);
            return null;
        } catch (OutOfMemoryError e11) {
            C3676r4.d().a(e11);
            String str = "Error while decompressing:" + e11.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }
}
