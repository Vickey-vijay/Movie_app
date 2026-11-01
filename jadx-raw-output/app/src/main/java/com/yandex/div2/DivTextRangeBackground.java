package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBackground.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivTextRangeBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f49619b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeBackground> f49620c = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeBackground>() { // from class: com.yandex.div2.DivTextRangeBackground$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBackground mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeBackground.f49619b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49621a;

    /* JADX INFO: compiled from: DivTextRangeBackground.kt */
    public static final class a extends DivTextRangeBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivCloudBackground f49622d;

        public a(DivCloudBackground divCloudBackground) {
            super(null);
            this.f49622d = divCloudBackground;
        }

        public final DivCloudBackground c() {
            return this.f49622d;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeBackground.kt */
    public static final class c extends DivTextRangeBackground {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivSolidBackground f49623d;

        public c(DivSolidBackground divSolidBackground) {
            super(null);
            this.f49623d = divSolidBackground;
        }

        public final DivSolidBackground c() {
            return this.f49623d;
        }
    }

    public DivTextRangeBackground() {
    }

    public /* synthetic */ DivTextRangeBackground(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivTextRangeBackground.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public final DivTextRangeBackground a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().s8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivTextRangeBackground divTextRangeBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextRangeBackground == null) {
            return false;
        }
        if (this instanceof c) {
            DivSolidBackground divSolidBackgroundC = ((c) this).c();
            Object objB = divTextRangeBackground.b();
            return divSolidBackgroundC.a(objB instanceof DivSolidBackground ? (DivSolidBackground) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        DivCloudBackground divCloudBackgroundC = ((a) this).c();
        Object objB2 = divTextRangeBackground.b();
        return divCloudBackgroundC.a(objB2 instanceof DivCloudBackground ? (DivCloudBackground) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f49621a;
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
        this.f49621a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
