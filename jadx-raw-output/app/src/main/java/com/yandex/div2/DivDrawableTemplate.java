package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawableTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivDrawableTemplate implements JSONSerializable, JsonTemplate<DivDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47044a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDrawableTemplate> f47045b = new bk.p<ParsingEnvironment, JSONObject, DivDrawableTemplate>() { // from class: com.yandex.div2.DivDrawableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDrawableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivDrawableTemplate.a.b(DivDrawableTemplate.f47044a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivDrawableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivDrawableTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivDrawableTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().W2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivDrawableTemplate.kt */
    public static final class b extends DivDrawableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivShapeDrawableTemplate f47046c;

        public b(DivShapeDrawableTemplate divShapeDrawableTemplate) {
            super(null);
            this.f47046c = divShapeDrawableTemplate;
        }

        public final DivShapeDrawableTemplate b() {
            return this.f47046c;
        }
    }

    public DivDrawableTemplate() {
    }

    public /* synthetic */ DivDrawableTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof b) {
            return "shape_drawable";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
