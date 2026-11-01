package no;

import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;

/* JADX INFO: compiled from: RecoveringSOAPActionProcessorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alternative
public class n extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Logger f64919c = Logger.getLogger(po.h.class.getName());

    @Override // no.l, no.o, po.h
    public void a(qn.b bVar, nn.d dVar) throws UnsupportedDataException {
        try {
            super.a(bVar, dVar);
        } catch (UnsupportedDataException e10) {
            if (bVar.c()) {
                f64919c.warning("Trying to recover from invalid SOAP XML request: " + e10);
                try {
                    bVar.b(uo.c.c(i(bVar)));
                    super.a(bVar, dVar);
                    return;
                } catch (UnsupportedDataException e11) {
                    N(dVar, e10, e11);
                    return;
                }
            }
            throw e10;
        }
    }

    @Override // no.l, no.o, po.h
    public void c(qn.c cVar, nn.d dVar) throws UnsupportedDataException {
        try {
            super.c(cVar, dVar);
        } catch (UnsupportedDataException e10) {
            if (cVar.c()) {
                f64919c.warning("Trying to recover from invalid SOAP XML response: " + e10);
                String strC = uo.c.c(i(cVar));
                if (strC.endsWith("</s:Envelop")) {
                    strC = strC + "e>";
                }
                try {
                    cVar.b(strC);
                    super.c(cVar, dVar);
                    return;
                } catch (UnsupportedDataException e11) {
                    N(dVar, e10, e11);
                    return;
                }
            }
            throw e10;
        }
    }

    public void N(nn.d dVar, UnsupportedDataException unsupportedDataException, UnsupportedDataException unsupportedDataException2) throws UnsupportedDataException {
        throw unsupportedDataException;
    }
}
