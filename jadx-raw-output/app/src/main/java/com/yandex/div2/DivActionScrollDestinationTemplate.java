package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivActionScrollDestinationTemplate implements JSONSerializable, JsonTemplate<DivActionScrollDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46219a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionScrollDestinationTemplate> f46220b = new bk.p<ParsingEnvironment, JSONObject, DivActionScrollDestinationTemplate>() { // from class: com.yandex.div2.DivActionScrollDestinationTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollDestinationTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionScrollDestinationTemplate.a.b(DivActionScrollDestinationTemplate.f46219a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivActionScrollDestinationTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivActionScrollDestinationTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().E0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class b extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EndDestinationTemplate f46221c;

        public b(EndDestinationTemplate endDestinationTemplate) {
            super(null);
            this.f46221c = endDestinationTemplate;
        }

        public final EndDestinationTemplate b() {
            return this.f46221c;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class c extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IndexDestinationTemplate f46222c;

        public c(IndexDestinationTemplate indexDestinationTemplate) {
            super(null);
            this.f46222c = indexDestinationTemplate;
        }

        public final IndexDestinationTemplate b() {
            return this.f46222c;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class d extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OffsetDestinationTemplate f46223c;

        public d(OffsetDestinationTemplate offsetDestinationTemplate) {
            super(null);
            this.f46223c = offsetDestinationTemplate;
        }

        public final OffsetDestinationTemplate b() {
            return this.f46223c;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class e extends DivActionScrollDestinationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StartDestinationTemplate f46224c;

        public e(StartDestinationTemplate startDestinationTemplate) {
            super(null);
            this.f46224c = startDestinationTemplate;
        }

        public final StartDestinationTemplate b() {
            return this.f46224c;
        }
    }

    public DivActionScrollDestinationTemplate() {
    }

    public /* synthetic */ DivActionScrollDestinationTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof d) {
            return TypedValues.CycleType.S_WAVE_OFFSET;
        }
        if (this instanceof c) {
            return "index";
        }
        if (this instanceof e) {
            return "start";
        }
        if (this instanceof b) {
            return "end";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
