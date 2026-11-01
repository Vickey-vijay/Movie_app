package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivPageTransformationTemplate implements JSONSerializable, JsonTemplate<DivPageTransformation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48231a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPageTransformationTemplate> f48232b = new bk.p<ParsingEnvironment, JSONObject, DivPageTransformationTemplate>() { // from class: com.yandex.div2.DivPageTransformationTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageTransformationTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPageTransformationTemplate.a.b(DivPageTransformationTemplate.f48231a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivPageTransformationTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivPageTransformationTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().r5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
    public static final class b extends DivPageTransformationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivPageTransformationOverlapTemplate f48233c;

        public b(DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate) {
            super(null);
            this.f48233c = divPageTransformationOverlapTemplate;
        }

        public final DivPageTransformationOverlapTemplate b() {
            return this.f48233c;
        }
    }

    /* JADX INFO: compiled from: DivPageTransformationTemplate.kt */
    public static final class c extends DivPageTransformationTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivPageTransformationSlideTemplate f48234c;

        public c(DivPageTransformationSlideTemplate divPageTransformationSlideTemplate) {
            super(null);
            this.f48234c = divPageTransformationSlideTemplate;
        }

        public final DivPageTransformationSlideTemplate b() {
            return this.f48234c;
        }
    }

    public DivPageTransformationTemplate() {
    }

    public /* synthetic */ DivPageTransformationTemplate(ck.i iVar) {
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
            return "slide";
        }
        if (this instanceof b) {
            return "overlap";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
