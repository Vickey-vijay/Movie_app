package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyle.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivStrokeStyle implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49145b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeStyle> f49146c = new bk.p<ParsingEnvironment, JSONObject, DivStrokeStyle>() { // from class: com.yandex.div2.DivStrokeStyle$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyle mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivStrokeStyle.f49145b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49147a;

    /* JADX INFO: compiled from: DivStrokeStyle.kt */
    public static final class b extends DivStrokeStyle {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivStrokeStyleDashed f49148d;

        public b(DivStrokeStyleDashed divStrokeStyleDashed) {
            super(null);
            this.f49148d = divStrokeStyleDashed;
        }

        public final DivStrokeStyleDashed c() {
            return this.f49148d;
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyle.kt */
    public static final class c extends DivStrokeStyle {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivStrokeStyleSolid f49149d;

        public c(DivStrokeStyleSolid divStrokeStyleSolid) {
            super(null);
            this.f49149d = divStrokeStyleSolid;
        }

        public final DivStrokeStyleSolid c() {
            return this.f49149d;
        }
    }

    public DivStrokeStyle() {
    }

    public /* synthetic */ DivStrokeStyle(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivStrokeStyle.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivStrokeStyle a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().I7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivStrokeStyle divStrokeStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divStrokeStyle == null) {
            return false;
        }
        if (this instanceof c) {
            DivStrokeStyleSolid divStrokeStyleSolidC = ((c) this).c();
            Object objB = divStrokeStyle.b();
            return divStrokeStyleSolidC.a(objB instanceof DivStrokeStyleSolid ? (DivStrokeStyleSolid) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivStrokeStyleDashed divStrokeStyleDashedC = ((b) this).c();
        Object objB2 = divStrokeStyle.b();
        return divStrokeStyleDashedC.a(objB2 instanceof DivStrokeStyleDashed ? (DivStrokeStyleDashed) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f49147a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f49147a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
