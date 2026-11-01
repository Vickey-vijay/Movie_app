package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivActionCopyToClipboardContent implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46125b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContent> f46126c = new bk.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContent>() { // from class: com.yandex.div2.DivActionCopyToClipboardContent$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboardContent mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionCopyToClipboardContent.f46125b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46127a;

    /* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
    public static final class b extends DivActionCopyToClipboardContent {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ContentText f46128d;

        public b(ContentText contentText) {
            super(null);
            this.f46128d = contentText;
        }

        public final ContentText c() {
            return this.f46128d;
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
    public static final class c extends DivActionCopyToClipboardContent {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ContentUrl f46129d;

        public c(ContentUrl contentUrl) {
            super(null);
            this.f46129d = contentUrl;
        }

        public final ContentUrl c() {
            return this.f46129d;
        }
    }

    public DivActionCopyToClipboardContent() {
    }

    public /* synthetic */ DivActionCopyToClipboardContent(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionCopyToClipboardContent a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().c0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivActionCopyToClipboardContent divActionCopyToClipboardContent, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionCopyToClipboardContent == null) {
            return false;
        }
        if (this instanceof b) {
            ContentText contentTextC = ((b) this).c();
            Object objB = divActionCopyToClipboardContent.b();
            return contentTextC.a(objB instanceof ContentText ? (ContentText) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        ContentUrl contentUrlC = ((c) this).c();
        Object objB2 = divActionCopyToClipboardContent.b();
        return contentUrlC.a(objB2 instanceof ContentUrl ? (ContentUrl) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46127a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f46127a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
