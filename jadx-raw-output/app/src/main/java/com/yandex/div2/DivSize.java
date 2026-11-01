package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSize.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48801b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivSize> f48802c = new bk.p<ParsingEnvironment, JSONObject, DivSize>() { // from class: com.yandex.div2.DivSize$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivSize mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivSize.f48801b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48803a;

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class b extends DivSize {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivFixedSize f48804d;

        public b(DivFixedSize divFixedSize) {
            super(null);
            this.f48804d = divFixedSize;
        }

        public final DivFixedSize c() {
            return this.f48804d;
        }
    }

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class c extends DivSize {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivMatchParentSize f48805d;

        public c(DivMatchParentSize divMatchParentSize) {
            super(null);
            this.f48805d = divMatchParentSize;
        }

        public final DivMatchParentSize c() {
            return this.f48805d;
        }
    }

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class d extends DivSize {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivWrapContentSize f48806d;

        public d(DivWrapContentSize divWrapContentSize) {
            super(null);
            this.f48806d = divWrapContentSize;
        }

        public final DivWrapContentSize c() {
            return this.f48806d;
        }
    }

    public DivSize() {
    }

    public /* synthetic */ DivSize(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivSize a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().Y6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivSize divSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divSize == null) {
            return false;
        }
        if (this instanceof b) {
            DivFixedSize divFixedSizeC = ((b) this).c();
            Object objB = divSize.b();
            return divFixedSizeC.a(objB instanceof DivFixedSize ? (DivFixedSize) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivMatchParentSize divMatchParentSizeC = ((c) this).c();
            Object objB2 = divSize.b();
            return divMatchParentSizeC.a(objB2 instanceof DivMatchParentSize ? (DivMatchParentSize) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivWrapContentSize divWrapContentSizeC = ((d) this).c();
        Object objB3 = divSize.b();
        return divWrapContentSizeC.a(objB3 instanceof DivWrapContentSize ? (DivWrapContentSize) objB3 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48803a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f48803a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
