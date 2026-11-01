package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class d20 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp3 f76520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rp3 f76521b;

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f76521b.getClass();
        Object objA = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.f76521b.getClass();
            if (xmlPullParser.next() == 3) {
                return objA;
            }
            this.f76521b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                objA = this.f76520a.a(xmlPullParser, knVar);
            }
        }
    }

    public d20(jr0 jr0Var, rp3 rp3Var) {
        this.f76520a = jr0Var;
        this.f76521b = rp3Var;
    }
}
