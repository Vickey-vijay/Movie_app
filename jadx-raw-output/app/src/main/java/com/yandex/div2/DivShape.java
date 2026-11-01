package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShape.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivShape implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f48781b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivShape> f48782c = new bk.p<ParsingEnvironment, JSONObject, DivShape>() { // from class: com.yandex.div2.DivShape$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShape mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivShape.f48781b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48783a;

    /* JADX INFO: compiled from: DivShape.kt */
    public static final class a extends DivShape {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivCircleShape f48784d;

        public a(DivCircleShape divCircleShape) {
            super(null);
            this.f48784d = divCircleShape;
        }

        public final DivCircleShape c() {
            return this.f48784d;
        }
    }

    /* JADX INFO: compiled from: DivShape.kt */
    public static final class c extends DivShape {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivRoundedRectangleShape f48785d;

        public c(DivRoundedRectangleShape divRoundedRectangleShape) {
            super(null);
            this.f48785d = divRoundedRectangleShape;
        }

        public final DivRoundedRectangleShape c() {
            return this.f48785d;
        }
    }

    public DivShape() {
    }

    public /* synthetic */ DivShape(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivShape.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public final DivShape a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().V6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivShape divShape, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divShape == null) {
            return false;
        }
        if (this instanceof c) {
            DivRoundedRectangleShape divRoundedRectangleShapeC = ((c) this).c();
            Object objB = divShape.b();
            return divRoundedRectangleShapeC.a(objB instanceof DivRoundedRectangleShape ? (DivRoundedRectangleShape) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        DivCircleShape divCircleShapeC = ((a) this).c();
        Object objB2 = divShape.b();
        return divCircleShapeC.a(objB2 instanceof DivCircleShape ? (DivCircleShape) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48783a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((a) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f48783a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
