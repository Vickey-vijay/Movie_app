package com.yandex.div2;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivText.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivText implements JSONSerializable, Hashable, oe.e2 {
    public static final Expression<Boolean> A0;
    public static final Expression<DivLineStyle> B0;
    public static final Expression<DivAlignmentHorizontal> C0;
    public static final Expression<DivAlignmentVertical> D0;
    public static final Expression<Integer> E0;
    public static final Expression<Boolean> F0;
    public static final Expression<Truncate> G0;
    public static final Expression<DivLineStyle> H0;
    public static final Expression<DivVisibility> I0;
    public static final DivSize.c J0;
    public static final bk.p<ParsingEnvironment, JSONObject, DivText> K0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a f49453s0 = new a(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final DivAnimation f49454t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Expression<Double> f49455u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Expression<Boolean> f49456v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Expression<Long> f49457w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f49458x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final DivSize.d f49459y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final Expression<Double> f49460z0;
    public final List<DivFunction> A;
    public final DivSize B;
    public final List<DivAction> C;
    public final List<DivAction> D;
    public final String E;
    public final List<Image> F;
    public final DivLayoutProvider G;
    public final Expression<Double> H;
    public final Expression<Long> I;
    public final List<DivAction> J;
    public final DivEdgeInsets K;
    public final Expression<Long> L;
    public final Expression<Long> M;
    public final DivEdgeInsets N;
    public final List<DivAction> O;
    public final List<DivAction> P;
    public final List<Range> Q;
    public final Expression<String> R;
    public final Expression<Long> S;
    public final Expression<Boolean> T;
    public final List<DivAction> U;
    public final Expression<DivLineStyle> V;
    public final Expression<String> W;
    public final Expression<DivAlignmentHorizontal> X;
    public final Expression<DivAlignmentVertical> Y;
    public final Expression<Integer> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivAccessibility f49461a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final DivTextGradient f49462a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivAction f49463b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final DivShadow f49464b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivAnimation f49465c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Expression<Boolean> f49466c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f49467d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List<DivTooltip> f49468d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivAlignmentHorizontal> f49469e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final DivTransform f49470e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<DivAlignmentVertical> f49471f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final DivChangeTransition f49472f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Double> f49473g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final DivAppearanceTransition f49474g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<DivAnimator> f49475h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final DivAppearanceTransition f49476h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Boolean> f49477i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final List<DivTransitionTrigger> f49478i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<DivBackground> f49479j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Expression<Truncate> f49480j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DivBorder f49481k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Expression<DivLineStyle> f49482k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression<Boolean> f49483l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final List<DivTrigger> f49484l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression<Long> f49485m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final List<DivVariable> f49486m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DivDisappearAction> f49487n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Expression<DivVisibility> f49488n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<DivAction> f49489o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final DivVisibilityAction f49490o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Ellipsis f49491p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<DivVisibilityAction> f49492p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<DivExtension> f49493q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DivSize f49494q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DivFocus f49495r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Integer f49496r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression<Integer> f49497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression<String> f49498t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression<String> f49499u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Expression<Long> f49500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Expression<DivSizeUnit> f49501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression<JSONObject> f49502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression<DivFontWeight> f49503y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression<Long> f49504z;

    /* JADX INFO: compiled from: DivText.kt */
    public static final class Ellipsis implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f49505f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Ellipsis> f49506g = new bk.p<ParsingEnvironment, JSONObject, Ellipsis>() { // from class: com.yandex.div2.DivText$Ellipsis$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivText.Ellipsis mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivText.Ellipsis.f49505f.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<DivAction> f49507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Image> f49508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Range> f49509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<String> f49510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f49511e;

        public final boolean a(Ellipsis ellipsis, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (ellipsis == null) {
                return false;
            }
            List<DivAction> list = this.f49507a;
            if (list != null) {
                List<DivAction> list2 = ellipsis.f49507a;
                if (list2 == null) {
                    return false;
                }
                if (list.size() == list2.size()) {
                    Iterator<T> it = list.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                nj.s.u();
                            }
                            if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            } else {
                z10 = ellipsis.f49507a == null;
            }
            if (!z10) {
                return false;
            }
            List<Image> list3 = this.f49508b;
            if (list3 != null) {
                List<Image> list4 = ellipsis.f49508b;
                if (list4 == null) {
                    return false;
                }
                if (list3.size() == list4.size()) {
                    Iterator<T> it2 = list3.iterator();
                    int i12 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                nj.s.u();
                            }
                            if (((Image) next2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
                                i12 = i13;
                            }
                        }
                    }
                }
            } else {
                z11 = ellipsis.f49508b == null;
            }
            if (!z11) {
                return false;
            }
            List<Range> list5 = this.f49509c;
            if (list5 != null) {
                List<Range> list6 = ellipsis.f49509c;
                if (list6 == null) {
                    return false;
                }
                if (list5.size() == list6.size()) {
                    Iterator<T> it3 = list5.iterator();
                    int i14 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                nj.s.u();
                            }
                            if (((Range) next3).a(list6.get(i14), expressionResolver, expressionResolver2)) {
                                i14 = i15;
                            }
                        }
                    }
                }
            } else {
                z12 = ellipsis.f49509c == null;
            }
            return z12 && ck.p.e(this.f49510d.evaluate(expressionResolver), ellipsis.f49510d.evaluate(expressionResolver2));
        }

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Ellipsis a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().d8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int iHash;
            int iHash2;
            Integer num = this.f49511e;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Ellipsis.class).hashCode();
            List<DivAction> list = this.f49507a;
            int iHash3 = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                iHash = 0;
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            } else {
                iHash = 0;
            }
            int i10 = iHashCode + iHash;
            List<Image> list2 = this.f49508b;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                iHash2 = 0;
                while (it2.hasNext()) {
                    iHash2 += ((Image) it2.next()).hash();
                }
            } else {
                iHash2 = 0;
            }
            int i11 = i10 + iHash2;
            List<Range> list3 = this.f49509c;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    iHash3 += ((Range) it3.next()).hash();
                }
            }
            int iHashCode2 = i11 + iHash3 + this.f49510d.hashCode();
            this.f49511e = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public Ellipsis(List<DivAction> list, List<Image> list2, List<Range> list3, Expression<String> expression) {
            this.f49507a = list;
            this.f49508b = list2;
            this.f49509c = list3;
            this.f49510d = expression;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().d8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public static final class Image implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f49512l = new a(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final Expression<DivTextAlignmentVertical> f49513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final DivFixedSize f49514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Expression<IndexingDirection> f49515o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Expression<Boolean> f49516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Expression<DivBlendMode> f49517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final DivFixedSize f49518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Image> f49519s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Accessibility f49520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<DivTextAlignmentVertical> f49521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFixedSize f49522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<IndexingDirection> f49523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression<Boolean> f49524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression<Long> f49525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression<Integer> f49526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Expression<DivBlendMode> f49527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression<Uri> f49528i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final DivFixedSize f49529j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f49530k;

        /* JADX INFO: compiled from: DivText.kt */
        public static final class Accessibility implements JSONSerializable, Hashable {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f49531d = new a(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final Type f49532e = Type.AUTO;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final bk.p<ParsingEnvironment, JSONObject, Accessibility> f49533f = new bk.p<ParsingEnvironment, JSONObject, Accessibility>() { // from class: com.yandex.div2.DivText$Image$Accessibility$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivText.Image.Accessibility mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivText.Image.Accessibility.f49531d.a(parsingEnvironment, jSONObject);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Expression<String> f49534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Type f49535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f49536c;

            /* JADX INFO: compiled from: DivText.kt */
            public enum Type {
                NONE("none"),
                BUTTON("button"),
                IMAGE("image"),
                TEXT("text"),
                AUTO("auto");

                private final String value;
                public static final a Converter = new a(null);
                public static final bk.l<Type, String> TO_STRING = new bk.l<Type, String>() { // from class: com.yandex.div2.DivText$Image$Accessibility$Type$Converter$TO_STRING$1
                    @Override // bk.l
                    public final String invoke(DivText.Image.Accessibility.Type type) {
                        return DivText.Image.Accessibility.Type.Converter.b(type);
                    }
                };
                public static final bk.l<String, Type> FROM_STRING = new bk.l<String, Type>() { // from class: com.yandex.div2.DivText$Image$Accessibility$Type$Converter$FROM_STRING$1
                    @Override // bk.l
                    public final DivText.Image.Accessibility.Type invoke(String str) {
                        return DivText.Image.Accessibility.Type.Converter.a(str);
                    }
                };

                /* JADX INFO: compiled from: DivText.kt */
                public static final class a {
                    public a() {
                    }

                    public /* synthetic */ a(ck.i iVar) {
                        this();
                    }

                    public final Type a(String str) {
                        Type type = Type.NONE;
                        if (ck.p.e(str, type.value)) {
                            return type;
                        }
                        Type type2 = Type.BUTTON;
                        if (ck.p.e(str, type2.value)) {
                            return type2;
                        }
                        Type type3 = Type.IMAGE;
                        if (ck.p.e(str, type3.value)) {
                            return type3;
                        }
                        Type type4 = Type.TEXT;
                        if (ck.p.e(str, type4.value)) {
                            return type4;
                        }
                        Type type5 = Type.AUTO;
                        if (ck.p.e(str, type5.value)) {
                            return type5;
                        }
                        return null;
                    }

                    public final String b(Type type) {
                        return type.value;
                    }
                }

                Type(String str) {
                    this.value = str;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Accessibility() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public Accessibility(Expression<String> expression, Type type) {
                this.f49534a = expression;
                this.f49535b = type;
            }

            public final boolean a(Accessibility accessibility, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                if (accessibility == null) {
                    return false;
                }
                Expression<String> expression = this.f49534a;
                String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                Expression<String> expression2 = accessibility.f49534a;
                return ck.p.e(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f49535b == accessibility.f49535b;
            }

            /* JADX INFO: compiled from: DivText.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }

                public final Accessibility a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return BuiltInParserKt.getBuiltInParserComponent().j8().getValue().deserialize(parsingEnvironment, jSONObject);
                }
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f49536c;
                if (num != null) {
                    return num.intValue();
                }
                int iHashCode = ck.s.b(Accessibility.class).hashCode();
                Expression<String> expression = this.f49534a;
                int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f49535b.hashCode();
                this.f49536c = Integer.valueOf(iHashCode2);
                return iHashCode2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().j8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            public /* synthetic */ Accessibility(Expression expression, Type type, int i10, ck.i iVar) {
                this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f49532e : type);
            }
        }

        /* JADX INFO: compiled from: DivText.kt */
        public enum IndexingDirection {
            NORMAL("normal"),
            REVERSED("reversed");

            private final String value;
            public static final a Converter = new a(null);
            public static final bk.l<IndexingDirection, String> TO_STRING = new bk.l<IndexingDirection, String>() { // from class: com.yandex.div2.DivText$Image$IndexingDirection$Converter$TO_STRING$1
                @Override // bk.l
                public final String invoke(DivText.Image.IndexingDirection indexingDirection) {
                    return DivText.Image.IndexingDirection.Converter.b(indexingDirection);
                }
            };
            public static final bk.l<String, IndexingDirection> FROM_STRING = new bk.l<String, IndexingDirection>() { // from class: com.yandex.div2.DivText$Image$IndexingDirection$Converter$FROM_STRING$1
                @Override // bk.l
                public final DivText.Image.IndexingDirection invoke(String str) {
                    return DivText.Image.IndexingDirection.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivText.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(ck.i iVar) {
                    this();
                }

                public final IndexingDirection a(String str) {
                    IndexingDirection indexingDirection = IndexingDirection.NORMAL;
                    if (ck.p.e(str, indexingDirection.value)) {
                        return indexingDirection;
                    }
                    IndexingDirection indexingDirection2 = IndexingDirection.REVERSED;
                    if (ck.p.e(str, indexingDirection2.value)) {
                        return indexingDirection2;
                    }
                    return null;
                }

                public final String b(IndexingDirection indexingDirection) {
                    return indexingDirection.value;
                }
            }

            IndexingDirection(String str) {
                this.value = str;
            }
        }

        public final boolean a(Image image, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            if (image == null) {
                return false;
            }
            Accessibility accessibility = this.f49520a;
            if (accessibility != null) {
                zA = accessibility.a(image.f49520a, expressionResolver, expressionResolver2);
            } else {
                zA = image.f49520a == null;
            }
            if (!zA || this.f49521b.evaluate(expressionResolver) != image.f49521b.evaluate(expressionResolver2) || !this.f49522c.a(image.f49522c, expressionResolver, expressionResolver2) || this.f49523d.evaluate(expressionResolver) != image.f49523d.evaluate(expressionResolver2) || this.f49524e.evaluate(expressionResolver).booleanValue() != image.f49524e.evaluate(expressionResolver2).booleanValue() || this.f49525f.evaluate(expressionResolver).longValue() != image.f49525f.evaluate(expressionResolver2).longValue()) {
                return false;
            }
            Expression<Integer> expression = this.f49526g;
            Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Integer> expression2 = image.f49526g;
            return ck.p.e(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f49527h.evaluate(expressionResolver) == image.f49527h.evaluate(expressionResolver2) && ck.p.e(this.f49528i.evaluate(expressionResolver), image.f49528i.evaluate(expressionResolver2)) && this.f49529j.a(image.f49529j, expressionResolver, expressionResolver2);
        }

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Image a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().m8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            f49513m = Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            int i10 = 1;
            f49514n = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f49515o = Expression.Companion.constant$default(companion, IndexingDirection.NORMAL, null, 2, null);
            f49516p = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            f49517q = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            f49518r = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f49519s = new bk.p<ParsingEnvironment, JSONObject, Image>() { // from class: com.yandex.div2.DivText$Image$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivText.Image mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivText.Image.f49512l.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f49530k;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Image.class).hashCode();
            Accessibility accessibility = this.f49520a;
            int iHash = iHashCode + (accessibility != null ? accessibility.hash() : 0) + this.f49521b.hashCode() + this.f49522c.hash() + this.f49523d.hashCode() + this.f49524e.hashCode() + this.f49525f.hashCode();
            Expression<Integer> expression = this.f49526g;
            int iHashCode2 = iHash + (expression != null ? expression.hashCode() : 0) + this.f49527h.hashCode() + this.f49528i.hashCode() + this.f49529j.hash();
            this.f49530k = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public Image(Accessibility accessibility, Expression<DivTextAlignmentVertical> expression, DivFixedSize divFixedSize, Expression<IndexingDirection> expression2, Expression<Boolean> expression3, Expression<Long> expression4, Expression<Integer> expression5, Expression<DivBlendMode> expression6, Expression<Uri> expression7, DivFixedSize divFixedSize2) {
            this.f49520a = accessibility;
            this.f49521b = expression;
            this.f49522c = divFixedSize;
            this.f49523d = expression2;
            this.f49524e = expression3;
            this.f49525f = expression4;
            this.f49526g = expression5;
            this.f49527h = expression6;
            this.f49528i = expression7;
            this.f49529j = divFixedSize2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().m8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public static final class Range implements JSONSerializable, Hashable {
        public static final Expression<Long> A;
        public static final bk.p<ParsingEnvironment, JSONObject, Range> B;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f49539x = new a(null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Expression<Double> f49540y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Expression<DivSizeUnit> f49541z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<DivAction> f49542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression<DivTextAlignmentVertical> f49543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTextRangeBackground f49544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression<Double> f49545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DivTextRangeBorder f49546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression<Long> f49547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression<String> f49548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Expression<String> f49549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression<Long> f49550i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Expression<DivSizeUnit> f49551j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Expression<JSONObject> f49552k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Expression<DivFontWeight> f49553l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Expression<Long> f49554m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Expression<Double> f49555n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Expression<Long> f49556o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final DivTextRangeMask f49557p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Expression<Long> f49558q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Expression<DivLineStyle> f49559r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Expression<Integer> f49560s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final DivShadow f49561t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Expression<Long> f49562u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Expression<DivLineStyle> f49563v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Integer f49564w;

        public Range() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        }

        public Range(List<DivAction> list, Expression<DivTextAlignmentVertical> expression, DivTextRangeBackground divTextRangeBackground, Expression<Double> expression2, DivTextRangeBorder divTextRangeBorder, Expression<Long> expression3, Expression<String> expression4, Expression<String> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7, Expression<JSONObject> expression8, Expression<DivFontWeight> expression9, Expression<Long> expression10, Expression<Double> expression11, Expression<Long> expression12, DivTextRangeMask divTextRangeMask, Expression<Long> expression13, Expression<DivLineStyle> expression14, Expression<Integer> expression15, DivShadow divShadow, Expression<Long> expression16, Expression<DivLineStyle> expression17) {
            this.f49542a = list;
            this.f49543b = expression;
            this.f49544c = divTextRangeBackground;
            this.f49545d = expression2;
            this.f49546e = divTextRangeBorder;
            this.f49547f = expression3;
            this.f49548g = expression4;
            this.f49549h = expression5;
            this.f49550i = expression6;
            this.f49551j = expression7;
            this.f49552k = expression8;
            this.f49553l = expression9;
            this.f49554m = expression10;
            this.f49555n = expression11;
            this.f49556o = expression12;
            this.f49557p = divTextRangeMask;
            this.f49558q = expression13;
            this.f49559r = expression14;
            this.f49560s = expression15;
            this.f49561t = divShadow;
            this.f49562u = expression16;
            this.f49563v = expression17;
        }

        public final boolean a(Range range, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z10;
            boolean zA;
            boolean zA2;
            boolean zA3;
            boolean zA4;
            if (range == null) {
                return false;
            }
            List<DivAction> list = this.f49542a;
            if (list != null) {
                List<DivAction> list2 = range.f49542a;
                if (list2 == null) {
                    return false;
                }
                if (list.size() == list2.size()) {
                    Iterator<T> it = list.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                nj.s.u();
                            }
                            if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            } else {
                z10 = range.f49542a == null;
            }
            if (!z10) {
                return false;
            }
            Expression<DivTextAlignmentVertical> expression = this.f49543b;
            DivTextAlignmentVertical divTextAlignmentVerticalEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<DivTextAlignmentVertical> expression2 = range.f49543b;
            if (divTextAlignmentVerticalEvaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivTextRangeBackground divTextRangeBackground = this.f49544c;
            if (divTextRangeBackground != null) {
                zA = divTextRangeBackground.a(range.f49544c, expressionResolver, expressionResolver2);
            } else {
                zA = range.f49544c == null;
            }
            if (!zA) {
                return false;
            }
            if (!(this.f49545d.evaluate(expressionResolver).doubleValue() == range.f49545d.evaluate(expressionResolver2).doubleValue())) {
                return false;
            }
            DivTextRangeBorder divTextRangeBorder = this.f49546e;
            if (divTextRangeBorder != null) {
                zA2 = divTextRangeBorder.a(range.f49546e, expressionResolver, expressionResolver2);
            } else {
                zA2 = range.f49546e == null;
            }
            if (!zA2) {
                return false;
            }
            Expression<Long> expression3 = this.f49547f;
            Long lEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<Long> expression4 = range.f49547f;
            if (!ck.p.e(lEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression5 = this.f49548g;
            String strEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<String> expression6 = range.f49548g;
            if (!ck.p.e(strEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression7 = this.f49549h;
            String strEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = range.f49549h;
            if (!ck.p.e(strEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression9 = this.f49550i;
            Long lEvaluate2 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<Long> expression10 = range.f49550i;
            if (!ck.p.e(lEvaluate2, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || this.f49551j.evaluate(expressionResolver) != range.f49551j.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<JSONObject> expression11 = this.f49552k;
            JSONObject jSONObjectEvaluate = expression11 != null ? expression11.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression12 = range.f49552k;
            if (!ck.p.e(jSONObjectEvaluate, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression13 = this.f49553l;
            DivFontWeight divFontWeightEvaluate = expression13 != null ? expression13.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression14 = range.f49553l;
            if (divFontWeightEvaluate != (expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression15 = this.f49554m;
            Long lEvaluate3 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
            Expression<Long> expression16 = range.f49554m;
            if (!ck.p.e(lEvaluate3, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Double> expression17 = this.f49555n;
            Double dEvaluate = expression17 != null ? expression17.evaluate(expressionResolver) : null;
            Expression<Double> expression18 = range.f49555n;
            if (!ck.p.b(dEvaluate, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression19 = this.f49556o;
            Long lEvaluate4 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
            Expression<Long> expression20 = range.f49556o;
            if (!ck.p.e(lEvaluate4, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivTextRangeMask divTextRangeMask = this.f49557p;
            if (divTextRangeMask != null) {
                zA3 = divTextRangeMask.a(range.f49557p, expressionResolver, expressionResolver2);
            } else {
                zA3 = range.f49557p == null;
            }
            if (!zA3 || this.f49558q.evaluate(expressionResolver).longValue() != range.f49558q.evaluate(expressionResolver2).longValue()) {
                return false;
            }
            Expression<DivLineStyle> expression21 = this.f49559r;
            DivLineStyle divLineStyleEvaluate = expression21 != null ? expression21.evaluate(expressionResolver) : null;
            Expression<DivLineStyle> expression22 = range.f49559r;
            if (divLineStyleEvaluate != (expression22 != null ? expression22.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Integer> expression23 = this.f49560s;
            Integer numEvaluate = expression23 != null ? expression23.evaluate(expressionResolver) : null;
            Expression<Integer> expression24 = range.f49560s;
            if (!ck.p.e(numEvaluate, expression24 != null ? expression24.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivShadow divShadow = this.f49561t;
            if (divShadow != null) {
                zA4 = divShadow.a(range.f49561t, expressionResolver, expressionResolver2);
            } else {
                zA4 = range.f49561t == null;
            }
            if (!zA4) {
                return false;
            }
            Expression<Long> expression25 = this.f49562u;
            Long lEvaluate5 = expression25 != null ? expression25.evaluate(expressionResolver) : null;
            Expression<Long> expression26 = range.f49562u;
            if (!ck.p.e(lEvaluate5, expression26 != null ? expression26.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivLineStyle> expression27 = this.f49563v;
            DivLineStyle divLineStyleEvaluate2 = expression27 != null ? expression27.evaluate(expressionResolver) : null;
            Expression<DivLineStyle> expression28 = range.f49563v;
            return divLineStyleEvaluate2 == (expression28 != null ? expression28.evaluate(expressionResolver2) : null);
        }

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Range a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().y8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f49540y = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f49541z = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            A = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            B = new bk.p<ParsingEnvironment, JSONObject, Range>() { // from class: com.yandex.div2.DivText$Range$Companion$CREATOR$1
                @Override // bk.p
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivText.Range mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return DivText.Range.f49539x.a(parsingEnvironment, jSONObject);
                }
            };
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int iHash;
            Integer num = this.f49564w;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Range.class).hashCode();
            List<DivAction> list = this.f49542a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                iHash = 0;
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            } else {
                iHash = 0;
            }
            int i10 = iHashCode + iHash;
            Expression<DivTextAlignmentVertical> expression = this.f49543b;
            int iHashCode2 = i10 + (expression != null ? expression.hashCode() : 0);
            DivTextRangeBackground divTextRangeBackground = this.f49544c;
            int iHash2 = iHashCode2 + (divTextRangeBackground != null ? divTextRangeBackground.hash() : 0) + this.f49545d.hashCode();
            DivTextRangeBorder divTextRangeBorder = this.f49546e;
            int iHash3 = iHash2 + (divTextRangeBorder != null ? divTextRangeBorder.hash() : 0);
            Expression<Long> expression2 = this.f49547f;
            int iHashCode3 = iHash3 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<String> expression3 = this.f49548g;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<String> expression4 = this.f49549h;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression<Long> expression5 = this.f49550i;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0) + this.f49551j.hashCode();
            Expression<JSONObject> expression6 = this.f49552k;
            int iHashCode7 = iHashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression<DivFontWeight> expression7 = this.f49553l;
            int iHashCode8 = iHashCode7 + (expression7 != null ? expression7.hashCode() : 0);
            Expression<Long> expression8 = this.f49554m;
            int iHashCode9 = iHashCode8 + (expression8 != null ? expression8.hashCode() : 0);
            Expression<Double> expression9 = this.f49555n;
            int iHashCode10 = iHashCode9 + (expression9 != null ? expression9.hashCode() : 0);
            Expression<Long> expression10 = this.f49556o;
            int iHashCode11 = iHashCode10 + (expression10 != null ? expression10.hashCode() : 0);
            DivTextRangeMask divTextRangeMask = this.f49557p;
            int iHash4 = iHashCode11 + (divTextRangeMask != null ? divTextRangeMask.hash() : 0) + this.f49558q.hashCode();
            Expression<DivLineStyle> expression11 = this.f49559r;
            int iHashCode12 = iHash4 + (expression11 != null ? expression11.hashCode() : 0);
            Expression<Integer> expression12 = this.f49560s;
            int iHashCode13 = iHashCode12 + (expression12 != null ? expression12.hashCode() : 0);
            DivShadow divShadow = this.f49561t;
            int iHash5 = iHashCode13 + (divShadow != null ? divShadow.hash() : 0);
            Expression<Long> expression13 = this.f49562u;
            int iHashCode14 = iHash5 + (expression13 != null ? expression13.hashCode() : 0);
            Expression<DivLineStyle> expression14 = this.f49563v;
            int iHashCode15 = iHashCode14 + (expression14 != null ? expression14.hashCode() : 0);
            this.f49564w = Integer.valueOf(iHashCode15);
            return iHashCode15;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().y8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ Range(List list, Expression expression, DivTextRangeBackground divTextRangeBackground, Expression expression2, DivTextRangeBorder divTextRangeBorder, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, DivTextRangeMask divTextRangeMask, Expression expression13, Expression expression14, Expression expression15, DivShadow divShadow, Expression expression16, Expression expression17, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : expression, (i10 & 4) != 0 ? null : divTextRangeBackground, (i10 & 8) != 0 ? f49540y : expression2, (i10 & 16) != 0 ? null : divTextRangeBorder, (i10 & 32) != 0 ? null : expression3, (i10 & 64) != 0 ? null : expression4, (i10 & 128) != 0 ? null : expression5, (i10 & 256) != 0 ? null : expression6, (i10 & 512) != 0 ? f49541z : expression7, (i10 & 1024) != 0 ? null : expression8, (i10 & 2048) != 0 ? null : expression9, (i10 & 4096) != 0 ? null : expression10, (i10 & 8192) != 0 ? null : expression11, (i10 & 16384) != 0 ? null : expression12, (i10 & 32768) != 0 ? null : divTextRangeMask, (i10 & 65536) != 0 ? A : expression13, (i10 & 131072) != 0 ? null : expression14, (i10 & 262144) != 0 ? null : expression15, (i10 & 524288) != 0 ? null : divShadow, (i10 & 1048576) != 0 ? null : expression16, (i10 & 2097152) != 0 ? null : expression17);
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public enum Truncate {
        NONE("none"),
        START("start"),
        END("end"),
        MIDDLE("middle");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Truncate, String> TO_STRING = new bk.l<Truncate, String>() { // from class: com.yandex.div2.DivText$Truncate$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivText.Truncate truncate) {
                return DivText.Truncate.Converter.b(truncate);
            }
        };
        public static final bk.l<String, Truncate> FROM_STRING = new bk.l<String, Truncate>() { // from class: com.yandex.div2.DivText$Truncate$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivText.Truncate invoke(String str) {
                return DivText.Truncate.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Truncate a(String str) {
                Truncate truncate = Truncate.NONE;
                if (ck.p.e(str, truncate.value)) {
                    return truncate;
                }
                Truncate truncate2 = Truncate.START;
                if (ck.p.e(str, truncate2.value)) {
                    return truncate2;
                }
                Truncate truncate3 = Truncate.END;
                if (ck.p.e(str, truncate3.value)) {
                    return truncate3;
                }
                Truncate truncate4 = Truncate.MIDDLE;
                if (ck.p.e(str, truncate4.value)) {
                    return truncate4;
                }
                return null;
            }

            public final String b(Truncate truncate) {
                return truncate.value;
            }
        }

        Truncate(String str) {
            this.value = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivText(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, Expression<Boolean> expression4, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression5, Expression<Long> expression6, List<DivDisappearAction> list4, List<DivAction> list5, Ellipsis ellipsis, List<DivExtension> list6, DivFocus divFocus, Expression<Integer> expression7, Expression<String> expression8, Expression<String> expression9, Expression<Long> expression10, Expression<DivSizeUnit> expression11, Expression<JSONObject> expression12, Expression<DivFontWeight> expression13, Expression<Long> expression14, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, List<Image> list10, DivLayoutProvider divLayoutProvider, Expression<Double> expression15, Expression<Long> expression16, List<DivAction> list11, DivEdgeInsets divEdgeInsets, Expression<Long> expression17, Expression<Long> expression18, DivEdgeInsets divEdgeInsets2, List<DivAction> list12, List<DivAction> list13, List<Range> list14, Expression<String> expression19, Expression<Long> expression20, Expression<Boolean> expression21, List<DivAction> list15, Expression<DivLineStyle> expression22, Expression<String> expression23, Expression<DivAlignmentHorizontal> expression24, Expression<DivAlignmentVertical> expression25, Expression<Integer> expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression<Boolean> expression27, List<DivTooltip> list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list17, Expression<Truncate> expression28, Expression<DivLineStyle> expression29, List<DivTrigger> list18, List<? extends DivVariable> list19, Expression<DivVisibility> expression30, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list20, DivSize divSize2) {
        this.f49461a = divAccessibility;
        this.f49463b = divAction;
        this.f49465c = divAnimation;
        this.f49467d = list;
        this.f49469e = expression;
        this.f49471f = expression2;
        this.f49473g = expression3;
        this.f49475h = list2;
        this.f49477i = expression4;
        this.f49479j = list3;
        this.f49481k = divBorder;
        this.f49483l = expression5;
        this.f49485m = expression6;
        this.f49487n = list4;
        this.f49489o = list5;
        this.f49491p = ellipsis;
        this.f49493q = list6;
        this.f49495r = divFocus;
        this.f49497s = expression7;
        this.f49498t = expression8;
        this.f49499u = expression9;
        this.f49500v = expression10;
        this.f49501w = expression11;
        this.f49502x = expression12;
        this.f49503y = expression13;
        this.f49504z = expression14;
        this.A = list7;
        this.B = divSize;
        this.C = list8;
        this.D = list9;
        this.E = str;
        this.F = list10;
        this.G = divLayoutProvider;
        this.H = expression15;
        this.I = expression16;
        this.J = list11;
        this.K = divEdgeInsets;
        this.L = expression17;
        this.M = expression18;
        this.N = divEdgeInsets2;
        this.O = list12;
        this.P = list13;
        this.Q = list14;
        this.R = expression19;
        this.S = expression20;
        this.T = expression21;
        this.U = list15;
        this.V = expression22;
        this.W = expression23;
        this.X = expression24;
        this.Y = expression25;
        this.Z = expression26;
        this.f49462a0 = divTextGradient;
        this.f49464b0 = divShadow;
        this.f49466c0 = expression27;
        this.f49468d0 = list16;
        this.f49470e0 = divTransform;
        this.f49472f0 = divChangeTransition;
        this.f49474g0 = divAppearanceTransition;
        this.f49476h0 = divAppearanceTransition2;
        this.f49478i0 = list17;
        this.f49480j0 = expression28;
        this.f49482k0 = expression29;
        this.f49484l0 = list18;
        this.f49486m0 = list19;
        this.f49488n0 = expression30;
        this.f49490o0 = divVisibilityAction;
        this.f49492p0 = list20;
        this.f49494q0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivText B(DivText divText, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, DivBorder divBorder, Expression expression5, Expression expression6, List list4, List list5, Ellipsis ellipsis, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, Expression expression15, Expression expression16, List list11, DivEdgeInsets divEdgeInsets, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression expression27, List list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2, int i10, int i11, int i12, Object obj) {
        DivAccessibility divAccessibilityQ = (i10 & 1) != 0 ? divText.q() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divText.f49463b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divText.f49465c : divAnimation;
        List list21 = (i10 & 8) != 0 ? divText.f49467d : list;
        Expression expressionG = (i10 & 16) != 0 ? divText.g() : expression;
        Expression expressionN = (i10 & 32) != 0 ? divText.n() : expression2;
        Expression expressionO = (i10 & 64) != 0 ? divText.o() : expression3;
        List listY = (i10 & 128) != 0 ? divText.y() : list2;
        Expression expression31 = (i10 & 256) != 0 ? divText.f49477i : expression4;
        List background = (i10 & 512) != 0 ? divText.getBackground() : list3;
        DivBorder divBorderZ = (i10 & 1024) != 0 ? divText.z() : divBorder;
        Expression expression32 = (i10 & 2048) != 0 ? divText.f49483l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? divText.b() : expression6;
        List listK = (i10 & 8192) != 0 ? divText.k() : list4;
        List list22 = (i10 & 16384) != 0 ? divText.f49489o : list5;
        Ellipsis ellipsis2 = (i10 & 32768) != 0 ? divText.f49491p : ellipsis;
        List extensions = (i10 & 65536) != 0 ? divText.getExtensions() : list6;
        DivFocus divFocusP = (i10 & 131072) != 0 ? divText.p() : divFocus;
        Ellipsis ellipsis3 = ellipsis2;
        Expression expression33 = (i10 & 262144) != 0 ? divText.f49497s : expression7;
        Expression expression34 = (i10 & 524288) != 0 ? divText.f49498t : expression8;
        Expression expression35 = (i10 & 1048576) != 0 ? divText.f49499u : expression9;
        Expression expression36 = (i10 & 2097152) != 0 ? divText.f49500v : expression10;
        Expression expression37 = (i10 & 4194304) != 0 ? divText.f49501w : expression11;
        Expression expression38 = (i10 & 8388608) != 0 ? divText.f49502x : expression12;
        Expression expression39 = (i10 & 16777216) != 0 ? divText.f49503y : expression13;
        Expression expression40 = (i10 & 33554432) != 0 ? divText.f49504z : expression14;
        List listW = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divText.w() : list7;
        DivSize height = (i10 & 134217728) != 0 ? divText.getHeight() : divSize;
        Expression expression41 = expression40;
        List list23 = (i10 & 268435456) != 0 ? divText.C : list8;
        List list24 = (i10 & 536870912) != 0 ? divText.D : list9;
        String id2 = (i10 & 1073741824) != 0 ? divText.getId() : str;
        List list25 = (i10 & Integer.MIN_VALUE) != 0 ? divText.F : list10;
        DivLayoutProvider divLayoutProviderT = (i11 & 1) != 0 ? divText.t() : divLayoutProvider;
        List list26 = list25;
        Expression expression42 = (i11 & 2) != 0 ? divText.H : expression15;
        Expression expression43 = (i11 & 4) != 0 ? divText.I : expression16;
        List list27 = (i11 & 8) != 0 ? divText.J : list11;
        return divText.A(divAccessibilityQ, divAction2, divAnimation2, list21, expressionG, expressionN, expressionO, listY, expression31, background, divBorderZ, expression32, expressionB, listK, list22, ellipsis3, extensions, divFocusP, expression33, expression34, expression35, expression36, expression37, expression38, expression39, expression41, listW, height, list23, list24, id2, list26, divLayoutProviderT, expression42, expression43, list27, (i11 & 16) != 0 ? divText.d() : divEdgeInsets, (i11 & 32) != 0 ? divText.L : expression17, (i11 & 64) != 0 ? divText.M : expression18, (i11 & 128) != 0 ? divText.r() : divEdgeInsets2, (i11 & 256) != 0 ? divText.O : list12, (i11 & 512) != 0 ? divText.P : list13, (i11 & 1024) != 0 ? divText.Q : list14, (i11 & 2048) != 0 ? divText.f() : expression19, (i11 & 4096) != 0 ? divText.e() : expression20, (i11 & 8192) != 0 ? divText.T : expression21, (i11 & 16384) != 0 ? divText.s() : list15, (i11 & 32768) != 0 ? divText.V : expression22, (i11 & 65536) != 0 ? divText.W : expression23, (i11 & 131072) != 0 ? divText.X : expression24, (i11 & 262144) != 0 ? divText.Y : expression25, (i11 & 524288) != 0 ? divText.Z : expression26, (i11 & 1048576) != 0 ? divText.f49462a0 : divTextGradient, (i11 & 2097152) != 0 ? divText.f49464b0 : divShadow, (i11 & 4194304) != 0 ? divText.f49466c0 : expression27, (i11 & 8388608) != 0 ? divText.h() : list16, (i11 & 16777216) != 0 ? divText.l() : divTransform, (i11 & 33554432) != 0 ? divText.j() : divChangeTransition, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divText.x() : divAppearanceTransition, (i11 & 134217728) != 0 ? divText.i() : divAppearanceTransition2, (i11 & 268435456) != 0 ? divText.m() : list17, (i11 & 536870912) != 0 ? divText.f49480j0 : expression28, (i11 & 1073741824) != 0 ? divText.f49482k0 : expression29, (i11 & Integer.MIN_VALUE) != 0 ? divText.u() : list18, (i12 & 1) != 0 ? divText.c() : list19, (i12 & 2) != 0 ? divText.getVisibility() : expression30, (i12 & 4) != 0 ? divText.v() : divVisibilityAction, (i12 & 8) != 0 ? divText.a() : list20, (i12 & 16) != 0 ? divText.getWidth() : divSize2);
    }

    public final DivText A(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends DivAnimator> list2, Expression<Boolean> expression4, List<? extends DivBackground> list3, DivBorder divBorder, Expression<Boolean> expression5, Expression<Long> expression6, List<DivDisappearAction> list4, List<DivAction> list5, Ellipsis ellipsis, List<DivExtension> list6, DivFocus divFocus, Expression<Integer> expression7, Expression<String> expression8, Expression<String> expression9, Expression<Long> expression10, Expression<DivSizeUnit> expression11, Expression<JSONObject> expression12, Expression<DivFontWeight> expression13, Expression<Long> expression14, List<DivFunction> list7, DivSize divSize, List<DivAction> list8, List<DivAction> list9, String str, List<Image> list10, DivLayoutProvider divLayoutProvider, Expression<Double> expression15, Expression<Long> expression16, List<DivAction> list11, DivEdgeInsets divEdgeInsets, Expression<Long> expression17, Expression<Long> expression18, DivEdgeInsets divEdgeInsets2, List<DivAction> list12, List<DivAction> list13, List<Range> list14, Expression<String> expression19, Expression<Long> expression20, Expression<Boolean> expression21, List<DivAction> list15, Expression<DivLineStyle> expression22, Expression<String> expression23, Expression<DivAlignmentHorizontal> expression24, Expression<DivAlignmentVertical> expression25, Expression<Integer> expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression<Boolean> expression27, List<DivTooltip> list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List<? extends DivTransitionTrigger> list17, Expression<Truncate> expression28, Expression<DivLineStyle> expression29, List<DivTrigger> list18, List<? extends DivVariable> list19, Expression<DivVisibility> expression30, DivVisibilityAction divVisibilityAction, List<DivVisibilityAction> list20, DivSize divSize2) {
        return new DivText(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, expression4, list3, divBorder, expression5, expression6, list4, list5, ellipsis, list6, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, list7, divSize, list8, list9, str, list10, divLayoutProvider, expression15, expression16, list11, divEdgeInsets, expression17, expression18, divEdgeInsets2, list12, list13, list14, expression19, expression20, expression21, list15, expression22, expression23, expression24, expression25, expression26, divTextGradient, divShadow, expression27, list16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list17, expression28, expression29, list18, list19, expression30, divVisibilityAction, list20, divSize2);
    }

    public final boolean C(DivText divText, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zA3;
        boolean z13;
        boolean z14;
        boolean zA4;
        boolean z15;
        boolean zA5;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zA6;
        boolean z20;
        boolean zA7;
        boolean zA8;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean zA9;
        boolean zA10;
        boolean z25;
        boolean zA11;
        boolean zA12;
        boolean zA13;
        boolean zA14;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean zG;
        boolean z29;
        if (divText == null) {
            return false;
        }
        DivAccessibility divAccessibilityQ = q();
        if (divAccessibilityQ != null) {
            zA = divAccessibilityQ.a(divText.q(), expressionResolver, expressionResolver2);
        } else {
            zA = divText.q() == null;
        }
        if (!zA) {
            return false;
        }
        DivAction divAction = this.f49463b;
        if (divAction != null) {
            zA2 = divAction.a(divText.f49463b, expressionResolver, expressionResolver2);
        } else {
            zA2 = divText.f49463b == null;
        }
        if (!zA2 || !this.f49465c.a(divText.f49465c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f49467d;
        if (list != null) {
            List<DivAction> list2 = divText.f49467d;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divText.f49467d == null;
        }
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divText.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionN = n();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionN != null ? expressionN.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionN2 = divText.n();
        if (divAlignmentVerticalEvaluate != (expressionN2 != null ? expressionN2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(o().evaluate(expressionResolver).doubleValue() == divText.o().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listY = y();
        if (listY != null) {
            List<DivAnimator> listY2 = divText.y();
            if (listY2 == null) {
                return false;
            }
            if (listY.size() == listY2.size()) {
                Iterator<T> it2 = listY.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivAnimator) next2).a(listY2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        } else {
            z11 = divText.y() == null;
        }
        if (!z11) {
            return false;
        }
        Expression<Boolean> expression = this.f49477i;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Boolean> expression2 = divText.f49477i;
        if (!ck.p.e(boolEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divText.getBackground();
            if (background2 == null) {
                return false;
            }
            if (background.size() == background2.size()) {
                Iterator<T> it3 = background.iterator();
                int i14 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            nj.s.u();
                        }
                        if (((DivBackground) next3).a(background2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                }
            }
        } else {
            z12 = divText.getBackground() == null;
        }
        if (!z12) {
            return false;
        }
        DivBorder divBorderZ = z();
        if (divBorderZ != null) {
            zA3 = divBorderZ.a(divText.z(), expressionResolver, expressionResolver2);
        } else {
            zA3 = divText.z() == null;
        }
        if (!zA3 || this.f49483l.evaluate(expressionResolver).booleanValue() != divText.f49483l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divText.b();
        if (!ck.p.e(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divText.k();
            if (listK2 == null) {
                return false;
            }
            if (listK.size() == listK2.size()) {
                Iterator<T> it4 = listK.iterator();
                int i16 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            nj.s.u();
                        }
                        if (((DivDisappearAction) next4).g(listK2.get(i16), expressionResolver, expressionResolver2)) {
                            i16 = i17;
                        }
                    }
                }
            }
        } else {
            z13 = divText.k() == null;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f49489o;
        if (list3 != null) {
            List<DivAction> list4 = divText.f49489o;
            if (list4 == null) {
                return false;
            }
            if (list3.size() == list4.size()) {
                Iterator<T> it5 = list3.iterator();
                int i18 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        Object next5 = it5.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next5).a(list4.get(i18), expressionResolver, expressionResolver2)) {
                            i18 = i19;
                        }
                    }
                }
            }
        } else {
            z14 = divText.f49489o == null;
        }
        if (!z14) {
            return false;
        }
        Ellipsis ellipsis = this.f49491p;
        if (ellipsis != null) {
            zA4 = ellipsis.a(divText.f49491p, expressionResolver, expressionResolver2);
        } else {
            zA4 = divText.f49491p == null;
        }
        if (!zA4) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divText.getExtensions();
            if (extensions2 == null) {
                return false;
            }
            if (extensions.size() == extensions2.size()) {
                Iterator<T> it6 = extensions.iterator();
                int i20 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            nj.s.u();
                        }
                        if (((DivExtension) next6).a(extensions2.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                }
            }
        } else {
            z15 = divText.getExtensions() == null;
        }
        if (!z15) {
            return false;
        }
        DivFocus divFocusP = p();
        if (divFocusP != null) {
            zA5 = divFocusP.a(divText.p(), expressionResolver, expressionResolver2);
        } else {
            zA5 = divText.p() == null;
        }
        if (!zA5) {
            return false;
        }
        Expression<Integer> expression3 = this.f49497s;
        Integer numEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Integer> expression4 = divText.f49497s;
        if (!ck.p.e(numEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression5 = this.f49498t;
        String strEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<String> expression6 = divText.f49498t;
        if (!ck.p.e(strEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression7 = this.f49499u;
        String strEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = divText.f49499u;
        if (!ck.p.e(strEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.f49500v.evaluate(expressionResolver).longValue() != divText.f49500v.evaluate(expressionResolver2).longValue() || this.f49501w.evaluate(expressionResolver) != divText.f49501w.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression9 = this.f49502x;
        JSONObject jSONObjectEvaluate = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression10 = divText.f49502x;
        if (!ck.p.e(jSONObjectEvaluate, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression11 = this.f49503y;
        DivFontWeight divFontWeightEvaluate = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression12 = divText.f49503y;
        if (divFontWeightEvaluate != (expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression13 = this.f49504z;
        Long lEvaluate2 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = divText.f49504z;
        if (!ck.p.e(lEvaluate2, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivFunction> listW = w();
        if (listW != null) {
            List<DivFunction> listW2 = divText.w();
            if (listW2 == null) {
                return false;
            }
            if (listW.size() == listW2.size()) {
                Iterator<T> it7 = listW.iterator();
                int i22 = 0;
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            nj.s.u();
                        }
                        if (((DivFunction) next7).a(listW2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                }
            }
        } else {
            z16 = divText.w() == null;
        }
        if (!z16 || !getHeight().a(divText.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.C;
        if (list5 != null) {
            List<DivAction> list6 = divText.C;
            if (list6 == null) {
                return false;
            }
            if (list5.size() == list6.size()) {
                Iterator<T> it8 = list5.iterator();
                int i24 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next8).a(list6.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                }
            }
        } else {
            z17 = divText.C == null;
        }
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.D;
        if (list7 != null) {
            List<DivAction> list8 = divText.D;
            if (list8 == null) {
                return false;
            }
            if (list7.size() == list8.size()) {
                Iterator<T> it9 = list7.iterator();
                int i26 = 0;
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next9).a(list8.get(i26), expressionResolver, expressionResolver2)) {
                            i26 = i27;
                        }
                    }
                }
            }
        } else {
            z18 = divText.D == null;
        }
        if (!z18 || !ck.p.e(getId(), divText.getId())) {
            return false;
        }
        List<Image> list9 = this.F;
        if (list9 != null) {
            List<Image> list10 = divText.F;
            if (list10 == null) {
                return false;
            }
            if (list9.size() == list10.size()) {
                Iterator<T> it10 = list9.iterator();
                int i28 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            nj.s.u();
                        }
                        if (((Image) next10).a(list10.get(i28), expressionResolver, expressionResolver2)) {
                            i28 = i29;
                        }
                    }
                }
            }
        } else {
            z19 = divText.F == null;
        }
        if (!z19) {
            return false;
        }
        DivLayoutProvider divLayoutProviderT = t();
        if (divLayoutProviderT != null) {
            zA6 = divLayoutProviderT.a(divText.t(), expressionResolver, expressionResolver2);
        } else {
            zA6 = divText.t() == null;
        }
        if (!zA6) {
            return false;
        }
        if (!(this.H.evaluate(expressionResolver).doubleValue() == divText.H.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression15 = this.I;
        Long lEvaluate3 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
        Expression<Long> expression16 = divText.I;
        if (!ck.p.e(lEvaluate3, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> list11 = this.J;
        if (list11 != null) {
            List<DivAction> list12 = divText.J;
            if (list12 == null) {
                return false;
            }
            if (list11.size() == list12.size()) {
                Iterator<T> it11 = list11.iterator();
                int i30 = 0;
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next11).a(list12.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                }
            }
        } else {
            z20 = divText.J == null;
        }
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (divEdgeInsetsD != null) {
            zA7 = divEdgeInsetsD.a(divText.d(), expressionResolver, expressionResolver2);
        } else {
            zA7 = divText.d() == null;
        }
        if (!zA7) {
            return false;
        }
        Expression<Long> expression17 = this.L;
        Long lEvaluate4 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
        Expression<Long> expression18 = divText.L;
        if (!ck.p.e(lEvaluate4, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression19 = this.M;
        Long lEvaluate5 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
        Expression<Long> expression20 = divText.M;
        if (!ck.p.e(lEvaluate5, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsR = r();
        if (divEdgeInsetsR != null) {
            zA8 = divEdgeInsetsR.a(divText.r(), expressionResolver, expressionResolver2);
        } else {
            zA8 = divText.r() == null;
        }
        if (!zA8) {
            return false;
        }
        List<DivAction> list13 = this.O;
        if (list13 != null) {
            List<DivAction> list14 = divText.O;
            if (list14 == null) {
                return false;
            }
            if (list13.size() == list14.size()) {
                Iterator<T> it12 = list13.iterator();
                int i32 = 0;
                while (true) {
                    if (it12.hasNext()) {
                        Object next12 = it12.next();
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next12).a(list14.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                }
            }
        } else {
            z21 = divText.O == null;
        }
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.P;
        if (list15 != null) {
            List<DivAction> list16 = divText.P;
            if (list16 == null) {
                return false;
            }
            if (list15.size() == list16.size()) {
                Iterator<T> it13 = list15.iterator();
                int i34 = 0;
                while (true) {
                    if (it13.hasNext()) {
                        Object next13 = it13.next();
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next13).a(list16.get(i34), expressionResolver, expressionResolver2)) {
                            i34 = i35;
                        }
                    }
                }
            }
        } else {
            z22 = divText.P == null;
        }
        if (!z22) {
            return false;
        }
        List<Range> list17 = this.Q;
        if (list17 != null) {
            List<Range> list18 = divText.Q;
            if (list18 == null) {
                return false;
            }
            if (list17.size() == list18.size()) {
                Iterator<T> it14 = list17.iterator();
                int i36 = 0;
                while (true) {
                    if (it14.hasNext()) {
                        Object next14 = it14.next();
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            nj.s.u();
                        }
                        if (((Range) next14).a(list18.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                }
            }
        } else {
            z23 = divText.Q == null;
        }
        if (!z23) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate3 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divText.f();
        if (!ck.p.e(strEvaluate3, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate6 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divText.e();
        if (!ck.p.e(lEvaluate6, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.T.evaluate(expressionResolver).booleanValue() != divText.T.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> listS = s();
        if (listS != null) {
            List<DivAction> listS2 = divText.s();
            if (listS2 == null) {
                return false;
            }
            if (listS.size() == listS2.size()) {
                Iterator<T> it15 = listS.iterator();
                int i38 = 0;
                while (true) {
                    if (it15.hasNext()) {
                        Object next15 = it15.next();
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next15).a(listS2.get(i38), expressionResolver, expressionResolver2)) {
                            i38 = i39;
                        }
                    }
                }
            }
        } else {
            z24 = divText.s() == null;
        }
        if (!z24 || this.V.evaluate(expressionResolver) != divText.V.evaluate(expressionResolver2) || !ck.p.e(this.W.evaluate(expressionResolver), divText.W.evaluate(expressionResolver2)) || this.X.evaluate(expressionResolver) != divText.X.evaluate(expressionResolver2) || this.Y.evaluate(expressionResolver) != divText.Y.evaluate(expressionResolver2) || this.Z.evaluate(expressionResolver).intValue() != divText.Z.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        DivTextGradient divTextGradient = this.f49462a0;
        if (divTextGradient != null) {
            zA9 = divTextGradient.a(divText.f49462a0, expressionResolver, expressionResolver2);
        } else {
            zA9 = divText.f49462a0 == null;
        }
        if (!zA9) {
            return false;
        }
        DivShadow divShadow = this.f49464b0;
        if (divShadow != null) {
            zA10 = divShadow.a(divText.f49464b0, expressionResolver, expressionResolver2);
        } else {
            zA10 = divText.f49464b0 == null;
        }
        if (!zA10 || this.f49466c0.evaluate(expressionResolver).booleanValue() != divText.f49466c0.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divText.h();
            if (listH2 == null) {
                return false;
            }
            if (listH.size() == listH2.size()) {
                Iterator<T> it16 = listH.iterator();
                int i40 = 0;
                while (true) {
                    if (it16.hasNext()) {
                        Object next16 = it16.next();
                        int i41 = i40 + 1;
                        if (i40 < 0) {
                            nj.s.u();
                        }
                        if (((DivTooltip) next16).a(listH2.get(i40), expressionResolver, expressionResolver2)) {
                            i40 = i41;
                        }
                    }
                }
            }
        } else {
            z25 = divText.h() == null;
        }
        if (!z25) {
            return false;
        }
        DivTransform divTransformL = l();
        if (divTransformL != null) {
            zA11 = divTransformL.a(divText.l(), expressionResolver, expressionResolver2);
        } else {
            zA11 = divText.l() == null;
        }
        if (!zA11) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (divChangeTransitionJ != null) {
            zA12 = divChangeTransitionJ.a(divText.j(), expressionResolver, expressionResolver2);
        } else {
            zA12 = divText.j() == null;
        }
        if (!zA12) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionX = x();
        if (divAppearanceTransitionX != null) {
            zA13 = divAppearanceTransitionX.a(divText.x(), expressionResolver, expressionResolver2);
        } else {
            zA13 = divText.x() == null;
        }
        if (!zA13) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (divAppearanceTransitionI != null) {
            zA14 = divAppearanceTransitionI.a(divText.i(), expressionResolver, expressionResolver2);
        } else {
            zA14 = divText.i() == null;
        }
        if (!zA14) {
            return false;
        }
        List<DivTransitionTrigger> listM = m();
        if (listM != null) {
            List<DivTransitionTrigger> listM2 = divText.m();
            if (listM2 == null) {
                return false;
            }
            if (listM.size() == listM2.size()) {
                Iterator<T> it17 = listM.iterator();
                int i42 = 0;
                while (true) {
                    if (it17.hasNext()) {
                        Object next17 = it17.next();
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            nj.s.u();
                        }
                        if (((DivTransitionTrigger) next17) == listM2.get(i42)) {
                            i42 = i43;
                        }
                    }
                }
            }
        } else {
            z26 = divText.m() == null;
        }
        if (!z26 || this.f49480j0.evaluate(expressionResolver) != divText.f49480j0.evaluate(expressionResolver2) || this.f49482k0.evaluate(expressionResolver) != divText.f49482k0.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivTrigger> listU = u();
        if (listU != null) {
            List<DivTrigger> listU2 = divText.u();
            if (listU2 == null) {
                return false;
            }
            if (listU.size() == listU2.size()) {
                Iterator<T> it18 = listU.iterator();
                int i44 = 0;
                while (true) {
                    if (it18.hasNext()) {
                        Object next18 = it18.next();
                        int i45 = i44 + 1;
                        if (i44 < 0) {
                            nj.s.u();
                        }
                        if (((DivTrigger) next18).a(listU2.get(i44), expressionResolver, expressionResolver2)) {
                            i44 = i45;
                        }
                    }
                }
            }
        } else {
            z27 = divText.u() == null;
        }
        if (!z27) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divText.c();
            if (listC2 == null) {
                return false;
            }
            if (listC.size() == listC2.size()) {
                Iterator<T> it19 = listC.iterator();
                int i46 = 0;
                while (true) {
                    if (it19.hasNext()) {
                        Object next19 = it19.next();
                        int i47 = i46 + 1;
                        if (i46 < 0) {
                            nj.s.u();
                        }
                        if (((DivVariable) next19).a(listC2.get(i46), expressionResolver, expressionResolver2)) {
                            i46 = i47;
                        }
                    }
                }
            }
        } else {
            z28 = divText.c() == null;
        }
        if (!z28 || getVisibility().evaluate(expressionResolver) != divText.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionV = v();
        if (divVisibilityActionV != null) {
            zG = divVisibilityActionV.g(divText.v(), expressionResolver, expressionResolver2);
        } else {
            zG = divText.v() == null;
        }
        if (!zG) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divText.a();
            if (listA2 == null) {
                return false;
            }
            if (listA.size() == listA2.size()) {
                Iterator<T> it20 = listA.iterator();
                int i48 = 0;
                while (true) {
                    if (it20.hasNext()) {
                        Object next20 = it20.next();
                        int i49 = i48 + 1;
                        if (i48 < 0) {
                            nj.s.u();
                        }
                        if (((DivVisibilityAction) next20).g(listA2.get(i48), expressionResolver, expressionResolver2)) {
                            i48 = i49;
                        }
                    }
                }
            }
        } else {
            z29 = divText.a() == null;
        }
        return z29 && getWidth().a(divText.getWidth(), expressionResolver, expressionResolver2);
    }

    /* JADX INFO: compiled from: DivText.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivText a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().p8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f49454t0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f49455u0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f49456v0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49457w0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f49458x0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f49459y0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f49460z0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        A0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        B0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        C0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        D0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        E0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        F0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        G0 = Expression.Companion.constant$default(companion, Truncate.END, null, 2, null);
        H0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        I0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        J0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        K0 = new bk.p<ParsingEnvironment, JSONObject, DivText>() { // from class: com.yandex.div2.DivText$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivText mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivText.f49453s0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.e2
    public List<DivVisibilityAction> a() {
        return this.f49492p0;
    }

    @Override // oe.e2
    public Expression<Long> b() {
        return this.f49485m;
    }

    @Override // oe.e2
    public List<DivVariable> c() {
        return this.f49486m0;
    }

    @Override // oe.e2
    public DivEdgeInsets d() {
        return this.K;
    }

    @Override // oe.e2
    public Expression<Long> e() {
        return this.S;
    }

    @Override // oe.e2
    public Expression<String> f() {
        return this.R;
    }

    @Override // oe.e2
    public Expression<DivAlignmentHorizontal> g() {
        return this.f49469e;
    }

    @Override // oe.e2
    public List<DivBackground> getBackground() {
        return this.f49479j;
    }

    @Override // oe.e2
    public List<DivExtension> getExtensions() {
        return this.f49493q;
    }

    @Override // oe.e2
    public DivSize getHeight() {
        return this.B;
    }

    @Override // oe.e2
    public String getId() {
        return this.E;
    }

    @Override // oe.e2
    public Expression<DivVisibility> getVisibility() {
        return this.f49488n0;
    }

    @Override // oe.e2
    public DivSize getWidth() {
        return this.f49494q0;
    }

    @Override // oe.e2
    public List<DivTooltip> h() {
        return this.f49468d0;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        int iHash17;
        int iHash18;
        Integer num = this.f49496r0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivText.class).hashCode();
        DivAccessibility divAccessibilityQ = q();
        int iHash19 = 0;
        int iHash20 = iHashCode + (divAccessibilityQ != null ? divAccessibilityQ.hash() : 0);
        DivAction divAction = this.f49463b;
        int iHash21 = iHash20 + (divAction != null ? divAction.hash() : 0) + this.f49465c.hash();
        List<DivAction> list = this.f49467d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash21 + iHash;
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = i10 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionN = n();
        int iHashCode3 = iHashCode2 + (expressionN != null ? expressionN.hashCode() : 0) + o().hashCode();
        List<DivAnimator> listY = y();
        if (listY != null) {
            Iterator<T> it2 = listY.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAnimator) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHashCode3 + iHash2;
        Expression<Boolean> expression = this.f49477i;
        int iHashCode4 = i11 + (expression != null ? expression.hashCode() : 0);
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it3 = background.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivBackground) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHashCode4 + iHash3;
        DivBorder divBorderZ = z();
        int iHash22 = i12 + (divBorderZ != null ? divBorderZ.hash() : 0) + this.f49483l.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode5 = iHash22 + (expressionB != null ? expressionB.hashCode() : 0);
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it4 = listK.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivDisappearAction) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = iHashCode5 + iHash4;
        List<DivAction> list2 = this.f49489o;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = i13 + iHash5;
        Ellipsis ellipsis = this.f49491p;
        int iHash23 = i14 + (ellipsis != null ? ellipsis.hash() : 0);
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it6 = extensions.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivExtension) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i15 = iHash23 + iHash6;
        DivFocus divFocusP = p();
        int iHash24 = i15 + (divFocusP != null ? divFocusP.hash() : 0);
        Expression<Integer> expression2 = this.f49497s;
        int iHashCode6 = iHash24 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<String> expression3 = this.f49498t;
        int iHashCode7 = iHashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<String> expression4 = this.f49499u;
        int iHashCode8 = iHashCode7 + (expression4 != null ? expression4.hashCode() : 0) + this.f49500v.hashCode() + this.f49501w.hashCode();
        Expression<JSONObject> expression5 = this.f49502x;
        int iHashCode9 = iHashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<DivFontWeight> expression6 = this.f49503y;
        int iHashCode10 = iHashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        Expression<Long> expression7 = this.f49504z;
        int iHashCode11 = iHashCode10 + (expression7 != null ? expression7.hashCode() : 0);
        List<DivFunction> listW = w();
        if (listW != null) {
            Iterator<T> it7 = listW.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFunction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHash25 = iHashCode11 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.C;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash25 + iHash8;
        List<DivAction> list4 = this.D;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = i16 + iHash9;
        String id2 = getId();
        int iHashCode12 = i17 + (id2 != null ? id2.hashCode() : 0);
        List<Image> list5 = this.F;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((Image) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHashCode12 + iHash10;
        DivLayoutProvider divLayoutProviderT = t();
        int iHash26 = i18 + (divLayoutProviderT != null ? divLayoutProviderT.hash() : 0) + this.H.hashCode();
        Expression<Long> expression8 = this.I;
        int iHashCode13 = iHash26 + (expression8 != null ? expression8.hashCode() : 0);
        List<DivAction> list6 = this.J;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHashCode13 + iHash11;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash27 = i19 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        Expression<Long> expression9 = this.L;
        int iHashCode14 = iHash27 + (expression9 != null ? expression9.hashCode() : 0);
        Expression<Long> expression10 = this.M;
        int iHashCode15 = iHashCode14 + (expression10 != null ? expression10.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsR = r();
        int iHash28 = iHashCode15 + (divEdgeInsetsR != null ? divEdgeInsetsR.hash() : 0);
        List<DivAction> list7 = this.O;
        if (list7 != null) {
            Iterator<T> it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivAction) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = iHash28 + iHash12;
        List<DivAction> list8 = this.P;
        if (list8 != null) {
            Iterator<T> it13 = list8.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivAction) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = i20 + iHash13;
        List<Range> list9 = this.Q;
        if (list9 != null) {
            Iterator<T> it14 = list9.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((Range) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        Expression<String> expressionF = f();
        int iHashCode16 = i22 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode17 = iHashCode16 + (expressionE != null ? expressionE.hashCode() : 0) + this.T.hashCode();
        List<DivAction> listS = s();
        if (listS != null) {
            Iterator<T> it15 = listS.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((DivAction) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int iHashCode18 = iHashCode17 + iHash15 + this.V.hashCode() + this.W.hashCode() + this.X.hashCode() + this.Y.hashCode() + this.Z.hashCode();
        DivTextGradient divTextGradient = this.f49462a0;
        int iHash29 = iHashCode18 + (divTextGradient != null ? divTextGradient.hash() : 0);
        DivShadow divShadow = this.f49464b0;
        int iHash30 = iHash29 + (divShadow != null ? divShadow.hash() : 0) + this.f49466c0.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it16 = listH.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((DivTooltip) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int i23 = iHash30 + iHash16;
        DivTransform divTransformL = l();
        int iHash31 = i23 + (divTransformL != null ? divTransformL.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash32 = iHash31 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionX = x();
        int iHash33 = iHash32 + (divAppearanceTransitionX != null ? divAppearanceTransitionX.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash34 = iHash33 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listM = m();
        int iHashCode19 = iHash34 + (listM != null ? listM.hashCode() : 0) + this.f49480j0.hashCode() + this.f49482k0.hashCode();
        List<DivTrigger> listU = u();
        if (listU != null) {
            Iterator<T> it17 = listU.iterator();
            iHash17 = 0;
            while (it17.hasNext()) {
                iHash17 += ((DivTrigger) it17.next()).hash();
            }
        } else {
            iHash17 = 0;
        }
        int i24 = iHashCode19 + iHash17;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it18 = listC.iterator();
            iHash18 = 0;
            while (it18.hasNext()) {
                iHash18 += ((DivVariable) it18.next()).hash();
            }
        } else {
            iHash18 = 0;
        }
        int iHashCode20 = i24 + iHash18 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionV = v();
        int iHash35 = iHashCode20 + (divVisibilityActionV != null ? divVisibilityActionV.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it19 = listA.iterator();
            while (it19.hasNext()) {
                iHash19 += ((DivVisibilityAction) it19.next()).hash();
            }
        }
        int iHash36 = iHash35 + iHash19 + getWidth().hash();
        this.f49496r0 = Integer.valueOf(iHash36);
        return iHash36;
    }

    @Override // oe.e2
    public DivAppearanceTransition i() {
        return this.f49476h0;
    }

    @Override // oe.e2
    public DivChangeTransition j() {
        return this.f49472f0;
    }

    @Override // oe.e2
    public List<DivDisappearAction> k() {
        return this.f49487n;
    }

    @Override // oe.e2
    public DivTransform l() {
        return this.f49470e0;
    }

    @Override // oe.e2
    public List<DivTransitionTrigger> m() {
        return this.f49478i0;
    }

    @Override // oe.e2
    public Expression<DivAlignmentVertical> n() {
        return this.f49471f;
    }

    @Override // oe.e2
    public Expression<Double> o() {
        return this.f49473g;
    }

    @Override // oe.e2
    public DivFocus p() {
        return this.f49495r;
    }

    @Override // oe.e2
    public DivAccessibility q() {
        return this.f49461a;
    }

    @Override // oe.e2
    public DivEdgeInsets r() {
        return this.N;
    }

    @Override // oe.e2
    public List<DivAction> s() {
        return this.U;
    }

    @Override // oe.e2
    public DivLayoutProvider t() {
        return this.G;
    }

    @Override // oe.e2
    public List<DivTrigger> u() {
        return this.f49484l0;
    }

    @Override // oe.e2
    public DivVisibilityAction v() {
        return this.f49490o0;
    }

    @Override // oe.e2
    public List<DivFunction> w() {
        return this.A;
    }

    @Override // oe.e2
    public DivAppearanceTransition x() {
        return this.f49474g0;
    }

    @Override // oe.e2
    public List<DivAnimator> y() {
        return this.f49475h;
    }

    @Override // oe.e2
    public DivBorder z() {
        return this.f49481k;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
