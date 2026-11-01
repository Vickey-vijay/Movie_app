package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivIndicatorItemPlacement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47727b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacement> f47728c = new bk.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacement>() { // from class: com.yandex.div2.DivIndicatorItemPlacement$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivIndicatorItemPlacement mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivIndicatorItemPlacement.f47727b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47729a;

    /* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
    public static final class b extends DivIndicatorItemPlacement {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivDefaultIndicatorItemPlacement f47730d;

        public b(DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) {
            super(null);
            this.f47730d = divDefaultIndicatorItemPlacement;
        }

        public final DivDefaultIndicatorItemPlacement c() {
            return this.f47730d;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
    public static final class c extends DivIndicatorItemPlacement {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivStretchIndicatorItemPlacement f47731d;

        public c(DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) {
            super(null);
            this.f47731d = divStretchIndicatorItemPlacement;
        }

        public final DivStretchIndicatorItemPlacement c() {
            return this.f47731d;
        }
    }

    public DivIndicatorItemPlacement() {
    }

    public /* synthetic */ DivIndicatorItemPlacement(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivIndicatorItemPlacement a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().a4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivIndicatorItemPlacement divIndicatorItemPlacement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divIndicatorItemPlacement == null) {
            return false;
        }
        if (this instanceof b) {
            DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacementC = ((b) this).c();
            Object objB = divIndicatorItemPlacement.b();
            return divDefaultIndicatorItemPlacementC.a(objB instanceof DivDefaultIndicatorItemPlacement ? (DivDefaultIndicatorItemPlacement) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacementC = ((c) this).c();
        Object objB2 = divIndicatorItemPlacement.b();
        return divStretchIndicatorItemPlacementC.a(objB2 instanceof DivStretchIndicatorItemPlacement ? (DivStretchIndicatorItemPlacement) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f47729a;
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
        this.f47729a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
