package w9;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.CommentListVideoEntry;
import com.mgs.carparking.netbean.DiscussListEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ITEMCOMMENTVIDEOVIEWMODEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class y0 extends sl.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CommentListVideoEntry f73859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<DiscussListEntry> f73861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableList<u0> f73862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fm.c<u0> f73863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f73864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f73865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f73866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f73867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f73868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<String> f73869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f73870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f73871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f73872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<SpannableStringBuilder> f73873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f73874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f73875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ul.b f73876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ul.b f73877u;

    /* JADX INFO: compiled from: ITEMCOMMENTVIDEOVIEWMODEL.java */
    public class a extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f73878b;

        public a(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
            this.f73878b = videoplaydetailviewmodel;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            this.f73878b.f41402k.setValue(y0.this.f73874r);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#365899"));
            textPaint.setUnderlineText(false);
        }
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        em.o.b(this.f73874r);
    }

    public y0(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, CommentListVideoEntry commentListVideoEntry, int i10) {
        super(videoplaydetailviewmodel);
        this.f73860d = 0;
        this.f73861e = new ArrayList();
        this.f73862f = new ObservableArrayList();
        this.f73863g = fm.c.d(new fm.d() { // from class: w9.v0
            @Override // fm.d
            public final void a(fm.c cVar, int i11, Object obj) {
                cVar.f(7, R.layout.item_comment_video_second_item);
            }
        });
        this.f73864h = new ObservableField<>();
        this.f73865i = new ObservableField<>();
        this.f73866j = new ObservableField<>();
        this.f73867k = new ObservableField<>();
        this.f73868l = new ObservableField<>();
        this.f73869m = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f73870n = new ObservableField<>(bool);
        this.f73871o = new ObservableField<>(bool);
        Boolean bool2 = Boolean.TRUE;
        this.f73872p = new ObservableField<>(bool2);
        this.f73873q = new ObservableField<>();
        this.f73874r = "";
        this.f73876t = new ul.b(new ul.a() { // from class: w9.w0
            @Override // ul.a
            public final void call() {
                this.f73835a.f();
            }
        });
        this.f73877u = new ul.b(new ul.a() { // from class: w9.x0
            @Override // ul.a
            public final void call() {
                y0.g();
            }
        });
        this.f73859c = commentListVideoEntry;
        this.f73858b = i10;
        this.f73864h.set(commentListVideoEntry.getUser_info().getNickname());
        String content = commentListVideoEntry.getContent();
        if (!em.o.b(content)) {
            Matcher matcher = Pattern.compile("(http://|https://).+./").matcher(content);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
            if (matcher.find()) {
                this.f73874r = matcher.group();
                spannableStringBuilder.setSpan(new a(videoplaydetailviewmodel), content.indexOf("http"), content.lastIndexOf("/") + 1, 33);
                this.f73873q.set(spannableStringBuilder);
            } else {
                this.f73873q.set(spannableStringBuilder);
            }
        }
        if (!em.o.b(commentListVideoEntry.getUser_info().getHead_img())) {
            this.f73866j.set(commentListVideoEntry.getUser_info().getHead_img());
        }
        if (commentListVideoEntry.getDiscuss_list() != null && commentListVideoEntry.getDiscuss_list().size() > 0) {
            List<DiscussListEntry> discuss_list = commentListVideoEntry.getDiscuss_list();
            this.f73861e = discuss_list;
            this.f73860d = discuss_list.size();
            this.f73872p.set(bool2);
            this.f73871o.set(bool);
            if (commentListVideoEntry.getDiscuss_count() > 3) {
                this.f73870n.set(bool2);
                this.f73869m.set("查看全部" + commentListVideoEntry.getDiscuss_count() + "条评论");
            } else {
                this.f73870n.set(bool);
            }
            this.f73862f.clear();
            for (int i11 = 0; i11 < commentListVideoEntry.getDiscuss_list().size(); i11++) {
                this.f73862f.add(new u0(videoplaydetailviewmodel, commentListVideoEntry.getDiscuss_list().get(i11), i11, i10));
            }
            return;
        }
        this.f73872p.set(bool);
        this.f73871o.set(bool);
    }
}
