package yads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
public final class y73 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f84839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63 f84840b;

    public /* synthetic */ y73() {
        rp3 rp3Var = new rp3();
        g63[] g63VarArrValues = g63.values();
        this(rp3Var, new i63(new HashSet(nj.s.n(Arrays.copyOf(g63VarArrValues, g63VarArrValues.length)))));
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final x73 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f84839a.getClass();
        xmlPullParser.require(2, null, VastTagName.TRACKING);
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, TypedValues.CycleType.S_WAVE_OFFSET);
        this.f84839a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new x73(attributeValue, strA, attributeValue2 != null ? this.f84840b.a(attributeValue2) : null);
    }

    public y73(rp3 rp3Var, i63 i63Var) {
        this.f84839a = rp3Var;
        this.f84840b = i63Var;
    }
}
