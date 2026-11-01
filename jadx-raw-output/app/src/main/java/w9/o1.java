package w9;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.FEEDBACKRECORDVIEWMODEL;
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ITEMFEEDBACKRECORDVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class o1 extends sl.e<FEEDBACKRECORDVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FeedbackRecordEntry f73712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f73713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Boolean> f73714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f73715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableStringBuilder> f73716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ul.b f73717h;

    /* JADX INFO: compiled from: ITEMFEEDBACKRECORDVIEWMODEL.java */
    public class a extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FEEDBACKRECORDVIEWMODEL f73718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f73719c;

        public a(FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel, String str) {
            this.f73718b = feedbackrecordviewmodel;
            this.f73719c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            this.f73718b.f41184r.setValue(this.f73719c);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#365899"));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        sa.e.c(this.f73712c.getContent());
    }

    public o1(@NonNull FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel, FeedbackRecordEntry feedbackRecordEntry, String str, int i10) {
        super(feedbackrecordviewmodel);
        Boolean bool = Boolean.TRUE;
        this.f73713d = new ObservableField<>(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f73714e = new ObservableField<>(bool2);
        this.f73715f = new ObservableField<>();
        this.f73716g = new ObservableField<>();
        this.f73717h = new ul.b(new ul.a() { // from class: w9.n1
            @Override // ul.a
            public final void call() {
                this.f73707a.c();
            }
        });
        this.f73712c = feedbackRecordEntry;
        this.f72004b = str;
        if (i10 == 0) {
            this.f73713d.set(bool2);
        } else {
            this.f73713d.set(bool);
        }
        if (!em.o.b(sa.o0.S())) {
            this.f73715f.set(sa.o0.S());
        }
        String reply_content = feedbackRecordEntry.getReply_content();
        if (!em.o.b(reply_content)) {
            Matcher matcher = Pattern.compile("#(.+)#").matcher(reply_content);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reply_content);
            if (matcher.find()) {
                spannableStringBuilder.setSpan(new a(feedbackrecordviewmodel, matcher.group(1)), reply_content.indexOf("#"), reply_content.length(), 33);
                this.f73716g.set(spannableStringBuilder);
            } else {
                this.f73716g.set(spannableStringBuilder);
            }
        }
        if (em.o.b(feedbackRecordEntry.getReply_content())) {
            this.f73714e.set(bool2);
        } else {
            this.f73714e.set(bool);
        }
    }
}
