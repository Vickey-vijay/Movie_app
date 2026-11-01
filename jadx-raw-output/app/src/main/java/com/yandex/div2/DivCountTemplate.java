package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCountTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivCountTemplate implements JSONSerializable, JsonTemplate<DivCount> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46852a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCountTemplate> f46853b = new bk.p<ParsingEnvironment, JSONObject, DivCountTemplate>() { // from class: com.yandex.div2.DivCountTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCountTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivCountTemplate.a.b(DivCountTemplate.f46852a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivCountTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivCountTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivCountTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().w2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivCountTemplate.kt */
    public static final class b extends DivCountTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFixedCountTemplate f46854c;

        public b(DivFixedCountTemplate divFixedCountTemplate) {
            super(null);
            this.f46854c = divFixedCountTemplate;
        }

        public final DivFixedCountTemplate b() {
            return this.f46854c;
        }
    }

    /* JADX INFO: compiled from: DivCountTemplate.kt */
    public static final class c extends DivCountTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivInfinityCountTemplate f46855c;

        public c(DivInfinityCountTemplate divInfinityCountTemplate) {
            super(null);
            this.f46855c = divInfinityCountTemplate;
        }

        public final DivInfinityCountTemplate b() {
            return this.f46855c;
        }
    }

    public DivCountTemplate() {
    }

    public /* synthetic */ DivCountTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "infinity";
        }
        if (this instanceof b) {
            return "fixed";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
