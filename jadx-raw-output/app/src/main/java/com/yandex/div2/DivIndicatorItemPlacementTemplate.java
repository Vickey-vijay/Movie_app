package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivIndicatorItemPlacement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47732a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacementTemplate> f47733b = new bk.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivIndicatorItemPlacementTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivIndicatorItemPlacementTemplate.a.b(DivIndicatorItemPlacementTemplate.f47732a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivIndicatorItemPlacementTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivIndicatorItemPlacementTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().b4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class b extends DivIndicatorItemPlacementTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivDefaultIndicatorItemPlacementTemplate f47734c;

        public b(DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) {
            super(null);
            this.f47734c = divDefaultIndicatorItemPlacementTemplate;
        }

        public final DivDefaultIndicatorItemPlacementTemplate b() {
            return this.f47734c;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class c extends DivIndicatorItemPlacementTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivStretchIndicatorItemPlacementTemplate f47735c;

        public c(DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) {
            super(null);
            this.f47735c = divStretchIndicatorItemPlacementTemplate;
        }

        public final DivStretchIndicatorItemPlacementTemplate b() {
            return this.f47735c;
        }
    }

    public DivIndicatorItemPlacementTemplate() {
    }

    public /* synthetic */ DivIndicatorItemPlacementTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof b) {
            return "default";
        }
        if (this instanceof c) {
            return "stretch";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
