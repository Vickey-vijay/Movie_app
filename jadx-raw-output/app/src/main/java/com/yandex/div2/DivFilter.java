package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilter.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivFilter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f47135b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFilter> f47136c = new bk.p<ParsingEnvironment, JSONObject, DivFilter>() { // from class: com.yandex.div2.DivFilter$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilter mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFilter.f47135b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47137a;

    /* JADX INFO: compiled from: DivFilter.kt */
    public static final class a extends DivFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivBlur f47138d;

        public a(DivBlur divBlur) {
            super(null);
            this.f47138d = divBlur;
        }

        public final DivBlur c() {
            return this.f47138d;
        }
    }

    /* JADX INFO: compiled from: DivFilter.kt */
    public static final class c extends DivFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivFilterRtlMirror f47139d;

        public c(DivFilterRtlMirror divFilterRtlMirror) {
            super(null);
            this.f47139d = divFilterRtlMirror;
        }

        public final DivFilterRtlMirror c() {
            return this.f47139d;
        }
    }

    public DivFilter() {
    }

    public /* synthetic */ DivFilter(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivFilter.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public final DivFilter a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivFilter divFilter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divFilter == null) {
            return false;
        }
        if (this instanceof a) {
            DivBlur divBlurC = ((a) this).c();
            Object objB = divFilter.b();
            return divBlurC.a(objB instanceof DivBlur ? (DivBlur) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivFilterRtlMirror divFilterRtlMirrorC = ((c) this).c();
        Object objB2 = divFilter.b();
        return divFilterRtlMirrorC.a(objB2 instanceof DivFilterRtlMirror ? (DivFilterRtlMirror) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f47137a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f47137a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
