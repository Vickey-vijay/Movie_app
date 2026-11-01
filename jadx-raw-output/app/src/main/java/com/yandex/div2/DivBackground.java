package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackground.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46511b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivBackground> f46512c = new bk.p<ParsingEnvironment, JSONObject, DivBackground>() { // from class: com.yandex.div2.DivBackground$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBackground mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivBackground.f46511b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46513a;

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class b extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivImageBackground f46514d;

        public b(DivImageBackground divImageBackground) {
            super(null);
            this.f46514d = divImageBackground;
        }

        public final DivImageBackground c() {
            return this.f46514d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class c extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivLinearGradient f46515d;

        public c(DivLinearGradient divLinearGradient) {
            super(null);
            this.f46515d = divLinearGradient;
        }

        public final DivLinearGradient c() {
            return this.f46515d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class d extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivNinePatchBackground f46516d;

        public d(DivNinePatchBackground divNinePatchBackground) {
            super(null);
            this.f46516d = divNinePatchBackground;
        }

        public final DivNinePatchBackground c() {
            return this.f46516d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class e extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivRadialGradient f46517d;

        public e(DivRadialGradient divRadialGradient) {
            super(null);
            this.f46517d = divRadialGradient;
        }

        public final DivRadialGradient c() {
            return this.f46517d;
        }
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class f extends DivBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivSolidBackground f46518d;

        public f(DivSolidBackground divSolidBackground) {
            super(null);
            this.f46518d = divSolidBackground;
        }

        public final DivSolidBackground c() {
            return this.f46518d;
        }
    }

    public DivBackground() {
    }

    public /* synthetic */ DivBackground(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivBackground a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().F1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivBackground divBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divBackground == null) {
            return false;
        }
        if (this instanceof c) {
            DivLinearGradient divLinearGradientC = ((c) this).c();
            Object objB = divBackground.b();
            return divLinearGradientC.a(objB instanceof DivLinearGradient ? (DivLinearGradient) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DivRadialGradient divRadialGradientC = ((e) this).c();
            Object objB2 = divBackground.b();
            return divRadialGradientC.a(objB2 instanceof DivRadialGradient ? (DivRadialGradient) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivImageBackground divImageBackgroundC = ((b) this).c();
            Object objB3 = divBackground.b();
            return divImageBackgroundC.a(objB3 instanceof DivImageBackground ? (DivImageBackground) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            DivSolidBackground divSolidBackgroundC = ((f) this).c();
            Object objB4 = divBackground.b();
            return divSolidBackgroundC.a(objB4 instanceof DivSolidBackground ? (DivSolidBackground) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivNinePatchBackground divNinePatchBackgroundC = ((d) this).c();
        Object objB5 = divBackground.b();
        return divNinePatchBackgroundC.a(objB5 instanceof DivNinePatchBackground ? (DivNinePatchBackground) objB5 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46513a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f46513a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
