package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceTransition.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivAppearanceTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46491b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAppearanceTransition> f46492c = new bk.p<ParsingEnvironment, JSONObject, DivAppearanceTransition>() { // from class: com.yandex.div2.DivAppearanceTransition$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAppearanceTransition.f46491b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46493a;

    /* JADX INFO: compiled from: DivAppearanceTransition.kt */
    public static final class b extends DivAppearanceTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivFadeTransition f46494d;

        public b(DivFadeTransition divFadeTransition) {
            super(null);
            this.f46494d = divFadeTransition;
        }

        public final DivFadeTransition c() {
            return this.f46494d;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransition.kt */
    public static final class c extends DivAppearanceTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivScaleTransition f46495d;

        public c(DivScaleTransition divScaleTransition) {
            super(null);
            this.f46495d = divScaleTransition;
        }

        public final DivScaleTransition c() {
            return this.f46495d;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransition.kt */
    public static final class d extends DivAppearanceTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivAppearanceSetTransition f46496d;

        public d(DivAppearanceSetTransition divAppearanceSetTransition) {
            super(null);
            this.f46496d = divAppearanceSetTransition;
        }

        public final DivAppearanceSetTransition c() {
            return this.f46496d;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransition.kt */
    public static final class e extends DivAppearanceTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivSlideTransition f46497d;

        public e(DivSlideTransition divSlideTransition) {
            super(null);
            this.f46497d = divSlideTransition;
        }

        public final DivSlideTransition c() {
            return this.f46497d;
        }
    }

    public DivAppearanceTransition() {
    }

    public /* synthetic */ DivAppearanceTransition(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivAppearanceTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAppearanceTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().z1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivAppearanceTransition divAppearanceTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAppearanceTransition == null) {
            return false;
        }
        if (this instanceof d) {
            DivAppearanceSetTransition divAppearanceSetTransitionC = ((d) this).c();
            Object objB = divAppearanceTransition.b();
            return divAppearanceSetTransitionC.a(objB instanceof DivAppearanceSetTransition ? (DivAppearanceSetTransition) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivFadeTransition divFadeTransitionC = ((b) this).c();
            Object objB2 = divAppearanceTransition.b();
            return divFadeTransitionC.a(objB2 instanceof DivFadeTransition ? (DivFadeTransition) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivScaleTransition divScaleTransitionC = ((c) this).c();
            Object objB3 = divAppearanceTransition.b();
            return divScaleTransitionC.a(objB3 instanceof DivScaleTransition ? (DivScaleTransition) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        DivSlideTransition divSlideTransitionC = ((e) this).c();
        Object objB4 = divAppearanceTransition.b();
        return divSlideTransitionC.a(objB4 instanceof DivSlideTransition ? (DivSlideTransition) objB4 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46493a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((e) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f46493a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
