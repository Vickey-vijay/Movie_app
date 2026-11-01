package no;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PullSOAPActionProcessorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alternative
public class l extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f64917b = Logger.getLogger(po.h.class.getName());

    public Map<String, String> F(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            arrayList.add(actionArgument.e().toUpperCase(Locale.ROOT));
            Iterator it = Arrays.asList(actionArgument.b()).iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toUpperCase(Locale.ROOT));
            }
        }
        HashMap map = new HashMap();
        String name = xmlPullParser.getName();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 && arrayList.contains(xmlPullParser.getName().toUpperCase(Locale.ROOT))) {
                map.put(xmlPullParser.getName(), xmlPullParser.nextText());
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals(name))) {
                break;
            }
        }
        if (map.size() >= actionArgumentArr.length) {
            return map;
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + actionArgumentArr.length + " but found " + map.size());
    }

    public void J(XmlPullParser xmlPullParser) throws Exception {
        uo.c.e(xmlPullParser, "Body");
    }

    public ActionException M(XmlPullParser xmlPullParser) throws Exception {
        uo.c.e(xmlPullParser, "UPnPError");
        String strNextText = null;
        String strNextText2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(IronSourceConstants.EVENTS_ERROR_CODE)) {
                    strNextText = xmlPullParser.nextText();
                } else if (name.equals("errorDescription")) {
                    strNextText2 = xmlPullParser.nextText();
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("UPnPError"))) {
                break;
            }
        }
        if (strNextText == null) {
            throw new RuntimeException("Received fault element but no error code");
        }
        try {
            int iIntValue = Integer.valueOf(strNextText).intValue();
            ErrorCode byCode = ErrorCode.getByCode(iIntValue);
            if (byCode != null) {
                f64917b.fine("Reading fault element: " + byCode.getCode() + " - " + strNextText2);
                return new ActionException(byCode, strNextText2, false);
            }
            f64917b.fine("Reading fault element: " + iIntValue + " - " + strNextText2);
            return new ActionException(iIntValue, strNextText2);
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Error code was not a number");
        }
    }

    public String E(Map<String, String> map, ActionArgument actionArgument) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (actionArgument.g(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void G(XmlPullParser xmlPullParser, nn.d dVar) throws Exception {
        dVar.l(I(xmlPullParser, dVar.a().c()));
    }

    public void H(XmlPullParser xmlPullParser, nn.d dVar) throws Exception {
        dVar.n(I(xmlPullParser, dVar.a().f()));
    }

    public nn.b[] I(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) throws Exception {
        Map<String, String> mapF = F(xmlPullParser, actionArgumentArr);
        nn.b[] bVarArr = new nn.b[actionArgumentArr.length];
        for (int i10 = 0; i10 < actionArgumentArr.length; i10++) {
            ActionArgument actionArgument = actionArgumentArr[i10];
            String strE = E(mapF, actionArgument);
            if (strE != null) {
                f64917b.fine("Reading action argument: " + actionArgument.e());
                bVarArr[i10] = f(actionArgument, strE);
            } else {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Could not find argument '" + actionArgument.e() + "' node");
            }
        }
        return bVarArr;
    }

    public void K(XmlPullParser xmlPullParser, qn.b bVar, nn.d dVar) throws Exception {
        uo.c.e(xmlPullParser, dVar.a().d());
        G(xmlPullParser, dVar);
    }

    public void L(XmlPullParser xmlPullParser, nn.d dVar) throws Exception {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("Fault")) {
                    dVar.i(M(xmlPullParser));
                    return;
                }
                if (xmlPullParser.getName().equals(dVar.a().d() + "Response")) {
                    H(xmlPullParser, dVar);
                    return;
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("Body"))) {
                throw new ActionException(ErrorCode.ACTION_FAILED, String.format("Action SOAP response do not contain %s element", dVar.a().d() + "Response"));
            }
        }
    }

    @Override // no.o, po.h
    public void a(qn.b bVar, nn.d dVar) throws UnsupportedDataException {
        String strI = i(bVar);
        try {
            K(uo.c.b(strI), bVar, dVar);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10, e10, strI);
        }
    }

    @Override // no.o, po.h
    public void c(qn.c cVar, nn.d dVar) throws UnsupportedDataException {
        String strI = i(cVar);
        try {
            XmlPullParser xmlPullParserB = uo.c.b(strI);
            J(xmlPullParserB);
            L(xmlPullParserB, dVar);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10, e10, strI);
        }
    }
}
