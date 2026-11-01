package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipMode.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivTooltipMode implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49860b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltipMode> f49861c = new bk.p<ParsingEnvironment, JSONObject, DivTooltipMode>() { // from class: com.yandex.div2.DivTooltipMode$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipMode mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTooltipMode.f49860b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49862a;

    /* JADX INFO: compiled from: DivTooltipMode.kt */
    public static final class b extends DivTooltipMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivTooltipModeModal f49863d;

        public b(DivTooltipModeModal divTooltipModeModal) {
            super(null);
            this.f49863d = divTooltipModeModal;
        }

        public final DivTooltipModeModal c() {
            return this.f49863d;
        }
    }

    /* JADX INFO: compiled from: DivTooltipMode.kt */
    public static final class c extends DivTooltipMode {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivTooltipModeNonModal f49864d;

        public c(DivTooltipModeNonModal divTooltipModeNonModal) {
            super(null);
            this.f49864d = divTooltipModeNonModal;
        }

        public final DivTooltipModeNonModal c() {
            return this.f49864d;
        }
    }

    public DivTooltipMode() {
    }

    public /* synthetic */ DivTooltipMode(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivTooltipMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTooltipMode a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().S8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivTooltipMode divTooltipMode, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTooltipMode == null) {
            return false;
        }
        if (this instanceof c) {
            DivTooltipModeNonModal divTooltipModeNonModalC = ((c) this).c();
            Object objB = divTooltipMode.b();
            return divTooltipModeNonModalC.a(objB instanceof DivTooltipModeNonModal ? (DivTooltipModeNonModal) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTooltipModeModal divTooltipModeModalC = ((b) this).c();
        Object objB2 = divTooltipMode.b();
        return divTooltipModeModalC.a(objB2 instanceof DivTooltipModeModal ? (DivTooltipModeModal) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f49862a;
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
        this.f49862a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
