package com.yandex.div.core.view2.spannable;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import ek.b;
import ik.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: MaskSpan.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MaskSpan extends PositionAwareReplacementSpan {
    private boolean active;
    private final Paint fillPaint;
    private final DivLineHeightTextView hostView;
    private float lastHeight;
    private float lastWidth;
    private final MaskData mask;
    private final List<Particle> particles = new ArrayList();
    private long randomSeed;

    /* JADX INFO: compiled from: MaskSpan.kt */
    public static final class Particle {
        private float ageMs;
        private float angularVel;
        private float cx;
        private float cy;
        private float lifetimeMs;
        private float radius;
        private float vx;
        private float vy;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Particle)) {
                return false;
            }
            Particle particle = (Particle) obj;
            return Float.compare(this.cx, particle.cx) == 0 && Float.compare(this.cy, particle.cy) == 0 && Float.compare(this.radius, particle.radius) == 0 && Float.compare(this.vx, particle.vx) == 0 && Float.compare(this.vy, particle.vy) == 0 && Float.compare(this.angularVel, particle.angularVel) == 0 && Float.compare(this.lifetimeMs, particle.lifetimeMs) == 0 && Float.compare(this.ageMs, particle.ageMs) == 0;
        }

        public int hashCode() {
            return (((((((((((((Float.hashCode(this.cx) * 31) + Float.hashCode(this.cy)) * 31) + Float.hashCode(this.radius)) * 31) + Float.hashCode(this.vx)) * 31) + Float.hashCode(this.vy)) * 31) + Float.hashCode(this.angularVel)) * 31) + Float.hashCode(this.lifetimeMs)) * 31) + Float.hashCode(this.ageMs);
        }

        public String toString() {
            return "Particle(cx=" + this.cx + ", cy=" + this.cy + ", radius=" + this.radius + ", vx=" + this.vx + ", vy=" + this.vy + ", angularVel=" + this.angularVel + ", lifetimeMs=" + this.lifetimeMs + ", ageMs=" + this.ageMs + ')';
        }

        public final float getAgeMs() {
            return this.ageMs;
        }

        public final float getAngularVel() {
            return this.angularVel;
        }

        public final float getCx() {
            return this.cx;
        }

        public final float getCy() {
            return this.cy;
        }

        public final float getLifetimeMs() {
            return this.lifetimeMs;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final float getVx() {
            return this.vx;
        }

        public final float getVy() {
            return this.vy;
        }

        public final void setAgeMs(float f10) {
            this.ageMs = f10;
        }

        public final void setAngularVel(float f10) {
            this.angularVel = f10;
        }

        public final void setCx(float f10) {
            this.cx = f10;
        }

        public final void setCy(float f10) {
            this.cy = f10;
        }

        public final void setLifetimeMs(float f10) {
            this.lifetimeMs = f10;
        }

        public final void setRadius(float f10) {
            this.radius = f10;
        }

        public final void setVx(float f10) {
            this.vx = f10;
        }

        public final void setVy(float f10) {
            this.vy = f10;
        }

        public Particle(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.cx = f10;
            this.cy = f11;
            this.radius = f12;
            this.vx = f13;
            this.vy = f14;
            this.angularVel = f15;
            this.lifetimeMs = f16;
            this.ageMs = f17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        ParticlesTicker particlesTicker$div_release;
        ParticlesTicker particlesTicker$div_release2;
        float fMeasureText = paint.measureText(charSequence, i10, i11);
        float f11 = i14 - i12;
        MaskData maskData = this.mask;
        if (maskData instanceof MaskData.Solid) {
            this.fillPaint.setColor(((MaskData.Solid) maskData).getColor());
            canvas.drawRect(f10, i12, f10 + fMeasureText, i14, this.fillPaint);
            this.active = false;
            return;
        }
        if (maskData instanceof MaskData.Particles) {
            if (!(fMeasureText == this.lastWidth)) {
                initParticles(fMeasureText, f11, i10, i11, (MaskData.Particles) maskData);
            } else if (!(f11 == this.lastHeight) || this.particles.isEmpty()) {
                initParticles(fMeasureText, f11, i10, i11, (MaskData.Particles) maskData);
            }
            MaskData.Particles particles = (MaskData.Particles) maskData;
            this.fillPaint.setColor(particles.getColor());
            for (Particle particle : this.particles) {
                canvas.drawCircle(f10 + k.j(particle.getCx(), particle.getRadius(), fMeasureText - particle.getRadius()), i12 + k.j(particle.getCy(), particle.getRadius(), f11 - particle.getRadius()), particle.getRadius(), this.fillPaint);
            }
            if (particles.isAnimated()) {
                this.active = true;
                DivLineHeightTextView divLineHeightTextView = this.hostView;
                if (divLineHeightTextView == null || (particlesTicker$div_release = divLineHeightTextView.getParticlesTicker$div_release()) == null) {
                    return;
                }
                particlesTicker$div_release.track(this);
                return;
            }
            this.active = false;
            DivLineHeightTextView divLineHeightTextView2 = this.hostView;
            if (divLineHeightTextView2 == null || (particlesTicker$div_release2 = divLineHeightTextView2.getParticlesTicker$div_release()) == null) {
                return;
            }
            particlesTicker$div_release2.untrack(this);
        }
    }

    private final void initParticles(float f10, float f11, int i10, int i11, MaskData.Particles particles) {
        Resources resources;
        DisplayMetrics displayMetrics;
        this.lastWidth = f10;
        this.lastHeight = f11;
        this.particles.clear();
        this.randomSeed = ((((long) i10) * 73856093) ^ (((long) i11) * 19349663)) ^ ((long) b.c(particles.getDensity() * 1000.0f));
        Random random = new Random(this.randomSeed);
        float f12 = 1.0f;
        float fMax = Math.max(1.0f, particles.getParticleSize());
        double d10 = 3;
        float f13 = 0.7f;
        float fPow = ((float) Math.pow(fMax, 2)) * 3.1415927f * ((((float) Math.pow(1.5f, d10)) - ((float) Math.pow(0.7f, d10))) / 2.4f);
        float density = 0.0f;
        float f14 = fPow > 0.0f ? (f10 * f11) / fPow : 0.0f;
        if (particles.getDensity() >= 1.0f) {
            density = 0.99f;
        } else if (particles.getDensity() > 0.0f) {
            density = particles.getDensity();
        }
        int iK = k.k(b.c(f14 * density), 1, 800);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f12 = displayMetrics.density;
        }
        float f15 = 2.0f * f12;
        float f16 = (f12 * 9.0f) - f15;
        int i12 = 0;
        while (i12 < iK) {
            float fNextFloat = fMax * ((random.nextFloat() * 0.8f) + f13);
            float fNextFloat2 = ((float) (((double) random.nextFloat()) * 6.283185307179586d)) - 3.1415927f;
            float fNextFloat3 = (random.nextFloat() * f16) + f15;
            double d11 = fNextFloat2;
            float fCos = ((float) Math.cos(d11)) * fNextFloat3;
            float fSin = ((float) Math.sin(d11)) * fNextFloat3;
            float fNextFloat4 = (random.nextFloat() - 0.5f) * 0.5f;
            float fNextFloat5 = (random.nextFloat() * 6000.0f) + 6000.0f;
            this.particles.add(new Particle(random.nextFloat() * f10, random.nextFloat() * f11, fNextFloat, fCos, fSin, fNextFloat4, fNextFloat5, random.nextFloat() * fNextFloat5 * 0.5f));
            i12++;
            f15 = f15;
            f13 = 0.7f;
        }
    }

    private final void reinitParticle(Particle particle, float f10, float f11, MaskData.Particles particles) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Random random = new Random(this.randomSeed + ((long) particle.hashCode()));
        float f12 = 1.0f;
        particle.setRadius(Math.max(1.0f, particles.getParticleSize()) * ((random.nextFloat() * 0.8f) + 0.7f));
        particle.setCx(random.nextFloat() * f10);
        particle.setCy(random.nextFloat() * f11);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f12 = displayMetrics.density;
        }
        float f13 = 2.0f * f12;
        float fNextFloat = ((float) (((double) random.nextFloat()) * 6.283185307179586d)) - 3.1415927f;
        float fNextFloat2 = f13 + (random.nextFloat() * ((f12 * 9.0f) - f13));
        double d10 = fNextFloat;
        particle.setVx(((float) Math.cos(d10)) * fNextFloat2);
        particle.setVy(((float) Math.sin(d10)) * fNextFloat2);
        particle.setAngularVel((random.nextFloat() - 0.5f) * 0.5f);
        particle.setLifetimeMs((random.nextFloat() * 6000.0f) + 6000.0f);
        particle.setAgeMs(0.0f);
    }

    public final boolean isAlive$div_release() {
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        CharSequence text = divLineHeightTextView != null ? divLineHeightTextView.getText() : null;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        return (spanned == null || spanned.getSpanStart(this) == -1) ? false : true;
    }

    public final boolean onFrame$div_release(float f10) {
        MaskData maskData = this.mask;
        MaskData.Particles particles = maskData instanceof MaskData.Particles ? (MaskData.Particles) maskData : null;
        if (particles == null || !this.active || !particles.isEnabled() || !particles.isAnimated()) {
            return false;
        }
        if (f10 <= 0.0f) {
            return true;
        }
        float f11 = this.lastWidth;
        float f12 = this.lastHeight;
        for (Particle particle : this.particles) {
            float angularVel = particle.getAngularVel() * f10;
            if (!(angularVel == 0.0f)) {
                double d10 = angularVel;
                float fCos = (float) Math.cos(d10);
                float fSin = (float) Math.sin(d10);
                float vx = (particle.getVx() * fCos) - (particle.getVy() * fSin);
                float vx2 = (particle.getVx() * fSin) + (particle.getVy() * fCos);
                particle.setVx(vx);
                particle.setVy(vx2);
            }
            particle.setCx(particle.getCx() + (particle.getVx() * f10));
            particle.setCy(particle.getCy() + (particle.getVy() * f10));
            float radius = particle.getRadius();
            float f13 = -radius;
            if (particle.getCx() < f13) {
                particle.setCx(particle.getCx() + (radius * 2.0f) + f11);
            }
            if (particle.getCx() > f11 + radius) {
                particle.setCx(particle.getCx() - ((radius * 2.0f) + f11));
            }
            if (particle.getCy() < f13) {
                particle.setCy(particle.getCy() + (radius * 2.0f) + f12);
            }
            if (particle.getCy() > f12 + radius) {
                particle.setCy(particle.getCy() - ((radius * 2.0f) + f12));
            }
            particle.setAgeMs(particle.getAgeMs() + (1000.0f * f10));
            if (particle.getAgeMs() >= particle.getLifetimeMs()) {
                reinitParticle(particle, f11, f12, particles);
            }
        }
        return true;
    }

    public MaskSpan(MaskData maskData, DivLineHeightTextView divLineHeightTextView) {
        this.mask = maskData;
        this.hostView = divLineHeightTextView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        this.lastWidth = -1.0f;
        this.lastHeight = -1.0f;
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i10, i11);
    }
}
