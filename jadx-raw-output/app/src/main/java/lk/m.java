package lk;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class m {
    public static final i f(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new j(matcher, charSequence);
    }

    public static final i g(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new j(matcher, charSequence);
    }

    public static final ik.i h(MatchResult matchResult) {
        return ik.k.q(matchResult.start(), matchResult.end());
    }

    public static final ik.i i(MatchResult matchResult, int i10) {
        return ik.k.q(matchResult.start(i10), matchResult.end(i10));
    }

    public static final int j(Iterable<? extends e> iterable) {
        Iterator<? extends e> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
