package kotlin.text;

import bk.l;
import ck.i;
import ck.p;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kk.k;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import lk.a0;
import lk.j;
import lk.m;
import mj.r;
import nj.x;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Regex implements Serializable {
    public static final a Companion = new a(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class Serialized implements Serializable {
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        /* JADX INFO: compiled from: Regex.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }
        }

        public Serialized(String str, int i10) {
            p.j(str, "pattern");
            this.pattern = str;
            this.flags = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            p.i(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class b implements l<RegexOption, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f63008b;

        public b(int i10) {
            this.f63008b = i10;
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RegexOption regexOption) {
            RegexOption regexOption2 = regexOption;
            return Boolean.valueOf((this.f63008b & regexOption2.getMask()) == regexOption2.getValue());
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements l<lk.i, lk.i> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, lk.i.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // bk.l
        public final lk.i invoke(lk.i iVar) {
            p.j(iVar, "p0");
            return iVar.next();
        }
    }

    public Regex(Pattern pattern) {
        p.j(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public final String replace(CharSequence charSequence, String str) {
        p.j(charSequence, "input");
        p.j(str, "replacement");
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        p.i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    @d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {279, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 291}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements bk.p<k<? super String>, c<? super r>, Object> {
        public final /* synthetic */ CharSequence $input;
        public final /* synthetic */ int $limit;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CharSequence charSequence, int i10, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$input = charSequence;
            this.$limit = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = Regex.this.new AnonymousClass1(this.$input, this.$limit, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(k<? super String> kVar, c<? super r> cVar) {
            return ((AnonymousClass1) create(kVar, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:27:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Matcher matcher;
            AnonymousClass1 anonymousClass1;
            k kVar;
            int i10;
            String string;
            String string2;
            Object objF = sj.a.f();
            int i11 = this.label;
            int iEnd = 0;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            kotlin.c.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        int i12 = this.I$0;
                        Matcher matcher2 = (Matcher) this.L$1;
                        kVar = (k) this.L$0;
                        kotlin.c.b(obj);
                        anonymousClass1 = this;
                        i10 = i12;
                        matcher = matcher2;
                        iEnd = matcher.end();
                        i10++;
                        if (i10 != anonymousClass1.$limit - 1 || !matcher.find()) {
                            CharSequence charSequence = anonymousClass1.$input;
                            string2 = charSequence.subSequence(iEnd, charSequence.length()).toString();
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 3;
                            if (kVar.a(string2, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                        string = anonymousClass1.$input.subSequence(iEnd, matcher.start()).toString();
                        anonymousClass1.L$0 = kVar;
                        anonymousClass1.L$1 = matcher;
                        anonymousClass1.I$0 = i10;
                        anonymousClass1.label = 2;
                        if (kVar.a(string, anonymousClass1) == objF) {
                            return objF;
                        }
                        iEnd = matcher.end();
                        i10++;
                        if (i10 != anonymousClass1.$limit - 1) {
                        }
                        CharSequence charSequence2 = anonymousClass1.$input;
                        string2 = charSequence2.subSequence(iEnd, charSequence2.length()).toString();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 3;
                        if (kVar.a(string2, anonymousClass1) == objF) {
                            return objF;
                        }
                    }
                    return r.f64562a;
                }
                kotlin.c.b(obj);
            } else {
                kotlin.c.b(obj);
                k kVar2 = (k) this.L$0;
                matcher = Regex.this.nativePattern.matcher(this.$input);
                if (this.$limit != 1 && matcher.find()) {
                    anonymousClass1 = this;
                    kVar = kVar2;
                    i10 = 0;
                    string = anonymousClass1.$input.subSequence(iEnd, matcher.start()).toString();
                    anonymousClass1.L$0 = kVar;
                    anonymousClass1.L$1 = matcher;
                    anonymousClass1.I$0 = i10;
                    anonymousClass1.label = 2;
                    if (kVar.a(string, anonymousClass1) == objF) {
                        return objF;
                    }
                    iEnd = matcher.end();
                    i10++;
                    if (i10 != anonymousClass1.$limit - 1) {
                    }
                    CharSequence charSequence3 = anonymousClass1.$input;
                    string2 = charSequence3.subSequence(iEnd, charSequence3.length()).toString();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (kVar.a(string2, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                String string3 = this.$input.toString();
                this.label = 1;
                if (kVar2.a(string3, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public static /* synthetic */ lk.i find$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.find(charSequence, i10);
    }

    public static /* synthetic */ kk.i findAll$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.findAll(charSequence, i10);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.split(charSequence, i10);
    }

    public static /* synthetic */ kk.i splitToSequence$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.splitToSequence(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        p.i(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        p.j(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final lk.i find(CharSequence charSequence, int i10) {
        p.j(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        p.i(matcher, "matcher(...)");
        return m.f(matcher, i10, charSequence);
    }

    public final kk.i<lk.i> findAll(final CharSequence charSequence, final int i10) {
        p.j(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            return kk.r.o(new bk.a() { // from class: lk.l
                @Override // bk.a
                public final Object invoke() {
                    return Regex.b(this.f63625b, charSequence, i10);
                }
            }, AnonymousClass2.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        p.g(enumSetAllOf);
        x.M(enumSetAllOf, new b(iFlags));
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        p.i(setUnmodifiableSet, "unmodifiableSet(...)");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        p.i(strPattern, "pattern(...)");
        return strPattern;
    }

    public final lk.i matchAt(CharSequence charSequence, int i10) {
        p.j(charSequence, "input");
        Matcher matcherRegion = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        p.g(matcherRegion);
        return new j(matcherRegion, charSequence);
    }

    public final lk.i matchEntire(CharSequence charSequence) {
        p.j(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        p.i(matcher, "matcher(...)");
        return m.g(matcher, charSequence);
    }

    public final boolean matches(CharSequence charSequence) {
        p.j(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean matchesAt(CharSequence charSequence, int i10) {
        p.j(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length()).lookingAt();
    }

    public final String replace(CharSequence charSequence, l<? super lk.i, ? extends CharSequence> lVar) {
        p.j(charSequence, "input");
        p.j(lVar, "transform");
        int iIntValue = 0;
        lk.i iVarFind$default = find$default(this, charSequence, 0, 2, null);
        if (iVarFind$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, iIntValue, iVarFind$default.c().getStart().intValue());
            sb2.append(lVar.invoke(iVarFind$default));
            iIntValue = iVarFind$default.c().getEndInclusive().intValue() + 1;
            iVarFind$default = iVarFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (iVarFind$default != null);
        if (iIntValue < length) {
            sb2.append(charSequence, iIntValue, length);
        }
        String string = sb2.toString();
        p.i(string, "toString(...)");
        return string;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        p.j(charSequence, "input");
        p.j(str, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        p.i(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List<String> split(CharSequence charSequence, int i10) {
        p.j(charSequence, "input");
        a0.I0(i10);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return nj.r.e(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? ik.k.g(i10, 10) : 10);
        int iEnd = 0;
        int i11 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final kk.i<String> splitToSequence(CharSequence charSequence, int i10) {
        p.j(charSequence, "input");
        a0.I0(i10);
        return kk.l.b(new AnonymousClass1(charSequence, i10, null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        p.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str) {
        p.j(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        p.i(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public static final lk.i b(Regex regex, CharSequence charSequence, int i10) {
        return regex.find(charSequence, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, RegexOption regexOption) {
        p.j(str, "pattern");
        p.j(regexOption, "option");
        Pattern patternCompile = Pattern.compile(str, Companion.b(regexOption.getValue()));
        p.i(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str, Set<? extends RegexOption> set) {
        p.j(str, "pattern");
        p.j(set, "options");
        Pattern patternCompile = Pattern.compile(str, Companion.b(m.j(set)));
        p.i(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
