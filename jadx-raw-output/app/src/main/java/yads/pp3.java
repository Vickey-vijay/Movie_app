package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public final class pp3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp3 f81533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rp3 f81536d;

    public /* synthetic */ pp3(qp3 qp3Var, String str, String str2) {
        this(qp3Var, str, str2, new rp3());
    }

    @Override // yads.qp3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        rp3 rp3Var = this.f81536d;
        String str = this.f81534b;
        rp3Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f81536d.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f81536d.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (ck.p.e(this.f81535c, xmlPullParser.getName())) {
                    Object objA = this.f81533a.a(xmlPullParser, knVar);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } else {
                    this.f81536d.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public pp3(qp3 qp3Var, String str, String str2, rp3 rp3Var) {
        this.f81533a = qp3Var;
        this.f81534b = str;
        this.f81535c = str2;
        this.f81536d = rp3Var;
    }
}
