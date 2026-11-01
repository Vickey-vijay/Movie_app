package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutMode.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivPagerLayoutMode implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48295b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPagerLayoutMode> f48296c = new bk.p<ParsingEnvironment, JSONObject, DivPagerLayoutMode>() { // from class: com.yandex.div2.DivPagerLayoutMode$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPagerLayoutMode mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPagerLayoutMode.f48295b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48297a;

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class b extends DivPagerLayoutMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivNeighbourPageSize f48298d;

        public b(DivNeighbourPageSize divNeighbourPageSize) {
            super(null);
            this.f48298d = divNeighbourPageSize;
        }

        public final DivNeighbourPageSize c() {
            return this.f48298d;
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class c extends DivPagerLayoutMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPageContentSize f48299d;

        public c(DivPageContentSize divPageContentSize) {
            super(null);
            this.f48299d = divPageContentSize;
        }

        public final DivPageContentSize c() {
            return this.f48299d;
        }
    }

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class d extends DivPagerLayoutMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPageSize f48300d;

        public d(DivPageSize divPageSize) {
            super(null);
            this.f48300d = divPageSize;
        }

        public final DivPageSize c() {
            return this.f48300d;
        }
    }

    public DivPagerLayoutMode() {
    }

    public /* synthetic */ DivPagerLayoutMode(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivPagerLayoutMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPagerLayoutMode a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().C5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivPagerLayoutMode divPagerLayoutMode, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPagerLayoutMode == null) {
            return false;
        }
        if (this instanceof d) {
            DivPageSize divPageSizeC = ((d) this).c();
            Object objB = divPagerLayoutMode.b();
            return divPageSizeC.a(objB instanceof DivPageSize ? (DivPageSize) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivNeighbourPageSize divNeighbourPageSizeC = ((b) this).c();
            Object objB2 = divPagerLayoutMode.b();
            return divNeighbourPageSizeC.a(objB2 instanceof DivNeighbourPageSize ? (DivNeighbourPageSize) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPageContentSize divPageContentSizeC = ((c) this).c();
        Object objB3 = divPagerLayoutMode.b();
        return divPageContentSizeC.a(objB3 instanceof DivPageContentSize ? (DivPageContentSize) objB3 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
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
        Integer num = this.f48297a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f48297a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
