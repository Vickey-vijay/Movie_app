package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimator.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivAnimator implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f46474b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAnimator> f46475c = new bk.p<ParsingEnvironment, JSONObject, DivAnimator>() { // from class: com.yandex.div2.DivAnimator$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAnimator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAnimator.f46474b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46476a;

    /* JADX INFO: compiled from: DivAnimator.kt */
    public static final class a extends DivAnimator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivColorAnimator f46477d;

        public a(DivColorAnimator divColorAnimator) {
            super(null);
            this.f46477d = divColorAnimator;
        }

        public final DivColorAnimator c() {
            return this.f46477d;
        }
    }

    /* JADX INFO: compiled from: DivAnimator.kt */
    public static final class c extends DivAnimator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivNumberAnimator f46478d;

        public c(DivNumberAnimator divNumberAnimator) {
            super(null);
            this.f46478d = divNumberAnimator;
        }

        public final DivNumberAnimator c() {
            return this.f46478d;
        }
    }

    public DivAnimator() {
    }

    public /* synthetic */ DivAnimator(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivAnimator.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public final DivAnimator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().t1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivAnimator divAnimator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAnimator == null) {
            return false;
        }
        if (this instanceof a) {
            DivColorAnimator divColorAnimatorC = ((a) this).c();
            oe.b2 b2VarB = divAnimator.b();
            return divColorAnimatorC.f(b2VarB instanceof DivColorAnimator ? (DivColorAnimator) b2VarB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivNumberAnimator divNumberAnimatorC = ((c) this).c();
        oe.b2 b2VarB2 = divAnimator.b();
        return divNumberAnimatorC.f(b2VarB2 instanceof DivNumberAnimator ? (DivNumberAnimator) b2VarB2 : null, expressionResolver, expressionResolver2);
    }

    public final oe.b2 b() {
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
        Integer num = this.f46476a;
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
        this.f46476a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
