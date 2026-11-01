package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DivSizeTemplate implements JSONSerializable, JsonTemplate<DivSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48807a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSizeTemplate> f48808b = new bk.p<ParsingEnvironment, JSONObject, DivSizeTemplate>() { // from class: com.yandex.div2.DivSizeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSizeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivSizeTemplate.a.b(DivSizeTemplate.f48807a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivSizeTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivSizeTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().Z6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class b extends DivSizeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFixedSizeTemplate f48809c;

        public b(DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.f48809c = divFixedSizeTemplate;
        }

        public final DivFixedSizeTemplate b() {
            return this.f48809c;
        }
    }

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class c extends DivSizeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivMatchParentSizeTemplate f48810c;

        public c(DivMatchParentSizeTemplate divMatchParentSizeTemplate) {
            super(null);
            this.f48810c = divMatchParentSizeTemplate;
        }

        public final DivMatchParentSizeTemplate b() {
            return this.f48810c;
        }
    }

    /* JADX INFO: compiled from: DivSizeTemplate.kt */
    public static final class d extends DivSizeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivWrapContentSizeTemplate f48811c;

        public d(DivWrapContentSizeTemplate divWrapContentSizeTemplate) {
            super(null);
            this.f48811c = divWrapContentSizeTemplate;
        }

        public final DivWrapContentSizeTemplate b() {
            return this.f48811c;
        }
    }

    public DivSizeTemplate() {
    }

    public /* synthetic */ DivSizeTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof d) {
            return ((d) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof b) {
            return "fixed";
        }
        if (this instanceof c) {
            return "match_parent";
        }
        if (this instanceof d) {
            return "wrap_content";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
