package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.green.hand.library.EmojiGridAdapter;
import com.green.hand.library.R$id;
import com.green.hand.library.R$layout;
import com.green.hand.library.R$mipmap;
import com.green.hand.library.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class EmojiBoard extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f20903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f20904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f20905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f20909h;

    public class a implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            EmojiBoard.this.f20904c.a(i10);
        }
    }

    public class b extends PagerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<View> f20911b = new ArrayList();

        public class a implements EmojiGridAdapter.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EmojiBoard f20913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmojiGridAdapter f20914b;

            public a(EmojiBoard emojiBoard, EmojiGridAdapter emojiGridAdapter) {
                this.f20913a = emojiBoard;
                this.f20914b = emojiGridAdapter;
            }

            @Override // com.green.hand.library.EmojiGridAdapter.b
            public void a(int i10) {
                String str;
                if (EmojiBoard.this.f20905d != null) {
                    if (i10 == this.f20914b.getItemCount() - 1) {
                        str = "/DEL";
                    } else {
                        String str2 = "";
                        for (char c10 : Character.toChars(y6.a.a((EmojiBoard.this.f20903b.getCurrentItem() * y6.b.b()) + i10))) {
                            str2 = str2 + Character.toString(c10);
                        }
                        str = str2;
                    }
                    EmojiBoard.this.f20905d.onClick(str);
                }
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public b() {
            int iC = y6.b.c();
            int i10 = 0;
            while (i10 < iC) {
                RecyclerView recyclerView = new RecyclerView(EmojiBoard.this.f20909h);
                recyclerView.setLayoutManager(new GridLayoutManager(EmojiBoard.this.f20909h, 7));
                EmojiGridAdapter emojiGridAdapter = new EmojiGridAdapter();
                int iB = y6.b.b() * i10;
                i10++;
                int iB2 = y6.b.b() * i10;
                iB2 = y6.a.d() < iB2 ? y6.a.d() : iB2;
                if (EmojiBoard.this.isInEditMode()) {
                    return;
                }
                List<Integer> listC = y6.a.c(iB, iB2);
                if (EmojiBoard.this.f20906e == -1) {
                    listC.add(Integer.valueOf(R$mipmap.input_emoji_delete));
                } else {
                    listC.add(Integer.valueOf(EmojiBoard.this.f20906e));
                }
                emojiGridAdapter.e(listC);
                recyclerView.setAdapter(emojiGridAdapter);
                emojiGridAdapter.d(new a(EmojiBoard.this, emojiGridAdapter));
                this.f20911b.add(recyclerView);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f20911b.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            viewGroup.addView(this.f20911b.get(i10));
            return this.f20911b.get(i10);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f20916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<ImageView> f20917b = new ArrayList();

        public void a(int i10) {
            for (int i11 = 0; i11 < this.f20917b.size(); i11++) {
                if (i11 != i10) {
                    if (EmojiBoard.this.f20907f == -1) {
                        this.f20917b.get(i11).setImageResource(R$mipmap.input_emoji_indicator);
                    } else {
                        this.f20917b.get(i11).setImageResource(EmojiBoard.this.f20907f);
                    }
                } else if (EmojiBoard.this.f20908g == -1) {
                    this.f20917b.get(i11).setImageResource(R$mipmap.input_emoji_indicator_hover);
                } else {
                    this.f20917b.get(i11).setImageResource(EmojiBoard.this.f20908g);
                }
            }
        }

        public c(ViewGroup viewGroup) {
            this.f20916a = viewGroup;
            int iC = y6.b.c();
            for (int i10 = 0; i10 < iC; i10++) {
                ImageView imageView = new ImageView(EmojiBoard.this.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int i11 = (int) ((EmojiBoard.this.f20909h.getResources().getDisplayMetrics().density * 4.0f) + 0.5f);
                layoutParams.setMargins(i11, 0, i11, 0);
                imageView.setLayoutParams(layoutParams);
                if (i10 == 0) {
                    if (EmojiBoard.this.f20908g == -1) {
                        imageView.setImageResource(R$mipmap.input_emoji_indicator_hover);
                    } else {
                        imageView.setImageResource(EmojiBoard.this.f20908g);
                    }
                } else if (EmojiBoard.this.f20907f == -1) {
                    imageView.setImageResource(R$mipmap.input_emoji_indicator);
                } else {
                    imageView.setImageResource(EmojiBoard.this.f20907f);
                }
                this.f20917b.add(imageView);
                this.f20916a.addView(imageView);
            }
        }
    }

    public interface d {
        void onClick(String str);
    }

    public EmojiBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20906e = -1;
        this.f20907f = -1;
        this.f20908g = -1;
        this.f20909h = context;
        h(attributeSet);
    }

    public void setItemClickListener(d dVar) {
        this.f20905d = dVar;
    }

    public final void h(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(R$layout.input_emoji_board, this);
        this.f20903b = (ViewPager) findViewById(R$id.view_pager);
        this.f20904c = new c((ViewGroup) findViewById(R$id.indicator));
        this.f20903b.setAdapter(new b());
        this.f20903b.addOnPageChangeListener(new a());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = this.f20909h.obtainStyledAttributes(attributeSet, R$styleable.EmojiBoard);
            this.f20906e = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EmojiBoard_deleteIcon, -1);
            this.f20907f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EmojiBoard_emojiIndicator, -1);
            this.f20908g = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EmojiBoard_emojiIndicatorHover, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public EmojiBoard(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20906e = -1;
        this.f20907f = -1;
        this.f20908g = -1;
        this.f20909h = context;
        h(attributeSet);
    }
}
