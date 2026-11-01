package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DivShapeTemplate implements JSONSerializable, JsonTemplate<DivShape> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f48797a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivShapeTemplate> f48798b = new bk.p<ParsingEnvironment, JSONObject, DivShapeTemplate>() { // from class: com.yandex.div2.DivShapeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShapeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivShapeTemplate.b.b(DivShapeTemplate.f48797a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivShapeTemplate.kt */
    public static final class a extends DivShapeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivCircleShapeTemplate f48799c;

        public a(DivCircleShapeTemplate divCircleShapeTemplate) {
            super(null);
            this.f48799c = divCircleShapeTemplate;
        }

        public final DivCircleShapeTemplate b() {
            return this.f48799c;
        }
    }

    /* JADX INFO: compiled from: DivShapeTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivShapeTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivShapeTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().W6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivShapeTemplate.kt */
    public static final class c extends DivShapeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivRoundedRectangleShapeTemplate f48800c;

        public c(DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) {
            super(null);
            this.f48800c = divRoundedRectangleShapeTemplate;
        }

        public final DivRoundedRectangleShapeTemplate b() {
            return this.f48800c;
        }
    }

    public DivShapeTemplate() {
    }

    public /* synthetic */ DivShapeTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "rounded_rectangle";
        }
        if (this instanceof a) {
            return "circle";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
