package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenter.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivRadialGradientCenter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48441b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientCenter> f48442c = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientCenter>() { // from class: com.yandex.div2.DivRadialGradientCenter$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientCenter mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientCenter.f48441b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48443a;

    /* JADX INFO: compiled from: DivRadialGradientCenter.kt */
    public static final class b extends DivRadialGradientCenter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivRadialGradientFixedCenter f48444d;

        public b(DivRadialGradientFixedCenter divRadialGradientFixedCenter) {
            super(null);
            this.f48444d = divRadialGradientFixedCenter;
        }

        public final DivRadialGradientFixedCenter c() {
            return this.f48444d;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenter.kt */
    public static final class c extends DivRadialGradientCenter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivRadialGradientRelativeCenter f48445d;

        public c(DivRadialGradientRelativeCenter divRadialGradientRelativeCenter) {
            super(null);
            this.f48445d = divRadialGradientRelativeCenter;
        }

        public final DivRadialGradientRelativeCenter c() {
            return this.f48445d;
        }
    }

    public DivRadialGradientCenter() {
    }

    public /* synthetic */ DivRadialGradientCenter(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivRadialGradientCenter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRadialGradientCenter a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().c6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivRadialGradientCenter divRadialGradientCenter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divRadialGradientCenter == null) {
            return false;
        }
        if (this instanceof b) {
            DivRadialGradientFixedCenter divRadialGradientFixedCenterC = ((b) this).c();
            Object objB = divRadialGradientCenter.b();
            return divRadialGradientFixedCenterC.a(objB instanceof DivRadialGradientFixedCenter ? (DivRadialGradientFixedCenter) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientRelativeCenter divRadialGradientRelativeCenterC = ((c) this).c();
        Object objB2 = divRadialGradientCenter.b();
        return divRadialGradientRelativeCenterC.a(objB2 instanceof DivRadialGradientRelativeCenter ? (DivRadialGradientRelativeCenter) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48443a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f48443a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
