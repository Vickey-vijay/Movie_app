package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformation.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivPageTransformation implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48143b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageTransformation> f48144c = new bk.p<ParsingEnvironment, JSONObject, DivPageTransformation>() { // from class: com.yandex.div2.DivPageTransformation$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageTransformation mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPageTransformation.f48143b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48145a;

    /* JADX INFO: compiled from: DivPageTransformation.kt */
    public static final class b extends DivPageTransformation {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPageTransformationOverlap f48146d;

        public b(DivPageTransformationOverlap divPageTransformationOverlap) {
            super(null);
            this.f48146d = divPageTransformationOverlap;
        }

        public final DivPageTransformationOverlap c() {
            return this.f48146d;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformation.kt */
    public static final class c extends DivPageTransformation {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPageTransformationSlide f48147d;

        public c(DivPageTransformationSlide divPageTransformationSlide) {
            super(null);
            this.f48147d = divPageTransformationSlide;
        }

        public final DivPageTransformationSlide c() {
            return this.f48147d;
        }
    }

    public DivPageTransformation() {
    }

    public /* synthetic */ DivPageTransformation(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivPageTransformation.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPageTransformation a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().q5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivPageTransformation divPageTransformation, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPageTransformation == null) {
            return false;
        }
        if (this instanceof c) {
            DivPageTransformationSlide divPageTransformationSlideC = ((c) this).c();
            Object objB = divPageTransformation.b();
            return divPageTransformationSlideC.a(objB instanceof DivPageTransformationSlide ? (DivPageTransformationSlide) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPageTransformationOverlap divPageTransformationOverlapC = ((b) this).c();
        Object objB2 = divPageTransformation.b();
        return divPageTransformationOverlapC.a(objB2 instanceof DivPageTransformationOverlap ? (DivPageTransformationOverlap) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f48145a;
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
        this.f48145a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
