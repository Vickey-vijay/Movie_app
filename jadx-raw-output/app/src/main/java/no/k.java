package no;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PullGENAEventProcessorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alternative
public class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f64916b = Logger.getLogger(po.e.class.getName());

    @Override // no.g, po.e
    public void a(sn.a aVar) throws UnsupportedDataException {
        f64916b.fine("Reading body of: " + aVar);
        if (f64916b.isLoggable(Level.FINER)) {
            f64916b.finer("===================================== GENA BODY BEGIN ============================================");
            f64916b.finer(aVar.e() != null ? aVar.e().toString() : null);
            f64916b.finer("-===================================== GENA BODY END ============================================");
        }
        String strD = d(aVar);
        try {
            k(uo.c.b(strD), aVar);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10.getMessage(), e10, strD);
        }
    }

    public void k(XmlPullParser xmlPullParser, sn.a aVar) throws Exception {
        un.m<un.k>[] mVarArrI = aVar.z().i();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 2 && xmlPullParser.getName().equals("property")) {
                    l(xmlPullParser, aVar, mVarArrI);
                }
            } else {
                return;
            }
        }
    }

    public void l(XmlPullParser xmlPullParser, sn.a aVar, un.m[] mVarArr) throws Exception {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                for (un.m mVar : mVarArr) {
                    if (mVar.b().equals(name)) {
                        f64916b.fine("Reading state variable value: " + name);
                        aVar.A().add(new xn.d(mVar, xmlPullParser.nextText()));
                        break;
                    }
                }
            }
            if (next != 1) {
                if (next == 3 && xmlPullParser.getName().equals("property")) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
