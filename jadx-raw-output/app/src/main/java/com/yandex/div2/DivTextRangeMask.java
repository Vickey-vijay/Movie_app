package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMask.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivTextRangeMask implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49655b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMask> f49656c = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMask>() { // from class: com.yandex.div2.DivTextRangeMask$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMask mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeMask.f49655b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49657a;

    /* JADX INFO: compiled from: DivTextRangeMask.kt */
    public static final class b extends DivTextRangeMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivTextRangeMaskParticles f49658d;

        public b(DivTextRangeMaskParticles divTextRangeMaskParticles) {
            super(null);
            this.f49658d = divTextRangeMaskParticles;
        }

        public final DivTextRangeMaskParticles c() {
            return this.f49658d;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMask.kt */
    public static final class c extends DivTextRangeMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivTextRangeMaskSolid f49659d;

        public c(DivTextRangeMaskSolid divTextRangeMaskSolid) {
            super(null);
            this.f49659d = divTextRangeMaskSolid;
        }

        public final DivTextRangeMaskSolid c() {
            return this.f49659d;
        }
    }

    public DivTextRangeMask() {
    }

    public /* synthetic */ DivTextRangeMask(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivTextRangeMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextRangeMask a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().D8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivTextRangeMask divTextRangeMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextRangeMask == null) {
            return false;
        }
        if (this instanceof b) {
            DivTextRangeMaskParticles divTextRangeMaskParticlesC = ((b) this).c();
            Object objB = divTextRangeMask.b();
            return divTextRangeMaskParticlesC.a(objB instanceof DivTextRangeMaskParticles ? (DivTextRangeMaskParticles) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTextRangeMaskSolid divTextRangeMaskSolidC = ((c) this).c();
        Object objB2 = divTextRangeMask.b();
        return divTextRangeMaskSolidC.a(objB2 instanceof DivTextRangeMaskSolid ? (DivTextRangeMaskSolid) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f49657a;
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
        this.f49657a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
