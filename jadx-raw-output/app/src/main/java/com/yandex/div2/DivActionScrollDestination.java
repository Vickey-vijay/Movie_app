package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestination.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivActionScrollDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46212b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionScrollDestination> f46213c = new bk.p<ParsingEnvironment, JSONObject, DivActionScrollDestination>() { // from class: com.yandex.div2.DivActionScrollDestination$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollDestination mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionScrollDestination.f46212b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46214a;

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class b extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final EndDestination f46215d;

        public b(EndDestination endDestination) {
            super(null);
            this.f46215d = endDestination;
        }

        public final EndDestination c() {
            return this.f46215d;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class c extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final IndexDestination f46216d;

        public c(IndexDestination indexDestination) {
            super(null);
            this.f46216d = indexDestination;
        }

        public final IndexDestination c() {
            return this.f46216d;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class d extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final OffsetDestination f46217d;

        public d(OffsetDestination offsetDestination) {
            super(null);
            this.f46217d = offsetDestination;
        }

        public final OffsetDestination c() {
            return this.f46217d;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class e extends DivActionScrollDestination {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StartDestination f46218d;

        public e(StartDestination startDestination) {
            super(null);
            this.f46218d = startDestination;
        }

        public final StartDestination c() {
            return this.f46218d;
        }
    }

    public DivActionScrollDestination() {
    }

    public /* synthetic */ DivActionScrollDestination(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivActionScrollDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionScrollDestination a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().D0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionScrollDestination divActionScrollDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionScrollDestination == null) {
            return false;
        }
        if (this instanceof d) {
            OffsetDestination offsetDestinationC = ((d) this).c();
            Object objB = divActionScrollDestination.b();
            return offsetDestinationC.a(objB instanceof OffsetDestination ? (OffsetDestination) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            IndexDestination indexDestinationC = ((c) this).c();
            Object objB2 = divActionScrollDestination.b();
            return indexDestinationC.a(objB2 instanceof IndexDestination ? (IndexDestination) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            StartDestination startDestinationC = ((e) this).c();
            Object objB3 = divActionScrollDestination.b();
            return startDestinationC.a(objB3 instanceof StartDestination ? (StartDestination) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        EndDestination endDestinationC = ((b) this).c();
        Object objB4 = divActionScrollDestination.b();
        return endDestinationC.a(objB4 instanceof EndDestination ? (EndDestination) objB4 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46214a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f46214a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().D0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
