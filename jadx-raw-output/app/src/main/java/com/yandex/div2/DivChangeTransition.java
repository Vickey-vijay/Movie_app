package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransition.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivChangeTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f46586b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivChangeTransition> f46587c = new bk.p<ParsingEnvironment, JSONObject, DivChangeTransition>() { // from class: com.yandex.div2.DivChangeTransition$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeTransition mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivChangeTransition.f46586b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46588a;

    /* JADX INFO: compiled from: DivChangeTransition.kt */
    public static final class a extends DivChangeTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivChangeBoundsTransition f46589d;

        public a(DivChangeBoundsTransition divChangeBoundsTransition) {
            super(null);
            this.f46589d = divChangeBoundsTransition;
        }

        public final DivChangeBoundsTransition c() {
            return this.f46589d;
        }
    }

    /* JADX INFO: compiled from: DivChangeTransition.kt */
    public static final class c extends DivChangeTransition {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivChangeSetTransition f46590d;

        public c(DivChangeSetTransition divChangeSetTransition) {
            super(null);
            this.f46590d = divChangeSetTransition;
        }

        public final DivChangeSetTransition c() {
            return this.f46590d;
        }
    }

    public DivChangeTransition() {
    }

    public /* synthetic */ DivChangeTransition(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivChangeTransition.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public final DivChangeTransition a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().U1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivChangeTransition divChangeTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divChangeTransition == null) {
            return false;
        }
        if (this instanceof c) {
            DivChangeSetTransition divChangeSetTransitionC = ((c) this).c();
            Object objB = divChangeTransition.b();
            return divChangeSetTransitionC.a(objB instanceof DivChangeSetTransition ? (DivChangeSetTransition) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        DivChangeBoundsTransition divChangeBoundsTransitionC = ((a) this).c();
        Object objB2 = divChangeTransition.b();
        return divChangeBoundsTransitionC.a(objB2 instanceof DivChangeBoundsTransition ? (DivChangeBoundsTransition) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f46588a;
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
        this.f46588a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
