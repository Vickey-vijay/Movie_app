package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DivRadialGradientCenterTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientCenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48446a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate> f48447b = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate>() { // from class: com.yandex.div2.DivRadialGradientCenterTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientCenterTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientCenterTemplate.a.b(DivRadialGradientCenterTemplate.f48446a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivRadialGradientCenterTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivRadialGradientCenterTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().d6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class b extends DivRadialGradientCenterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivRadialGradientFixedCenterTemplate f48448c;

        public b(DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) {
            super(null);
            this.f48448c = divRadialGradientFixedCenterTemplate;
        }

        public final DivRadialGradientFixedCenterTemplate b() {
            return this.f48448c;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class c extends DivRadialGradientCenterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivRadialGradientRelativeCenterTemplate f48449c;

        public c(DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) {
            super(null);
            this.f48449c = divRadialGradientRelativeCenterTemplate;
        }

        public final DivRadialGradientRelativeCenterTemplate b() {
            return this.f48449c;
        }
    }

    public DivRadialGradientCenterTemplate() {
    }

    public /* synthetic */ DivRadialGradientCenterTemplate(ck.i iVar) {
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
            return "fixed";
        }
        if (this instanceof c) {
            return "relative";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
