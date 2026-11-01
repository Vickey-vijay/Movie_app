package yads;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class pl1 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f81452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc1 f81453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ml1 f81454c;

    public /* synthetic */ pl1() {
        this(new rp3(), new sc1(), new ml1());
    }

    @Override // yads.qp3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        this.f81452a.getClass();
        xmlPullParser.require(2, null, VastTagName.MEDIA_FILES);
        while (true) {
            this.f81452a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f81452a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (ck.p.e(name, VastTagName.MEDIA_FILE)) {
                    arrayList.add(this.f81454c.a(xmlPullParser));
                } else if (ck.p.e(name, "InteractiveCreativeFile")) {
                    rc1 rc1VarA = this.f81453b.a(xmlPullParser);
                    if (rc1VarA != null) {
                        arrayList.add(rc1VarA);
                    }
                } else {
                    this.f81452a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }

    public pl1(rp3 rp3Var, sc1 sc1Var, ml1 ml1Var) {
        this.f81452a = rp3Var;
        this.f81453b = sc1Var;
        this.f81454c = ml1Var;
    }
}
