package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes11.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pricing f15271a = new Pricing();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Video f15272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f15274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15279i;

    public static class Pricing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f15280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15281b;

        public String getCurrency() {
            return this.f15281b;
        }

        public double getValue() {
            return this.f15280a;
        }

        public void setValue(double d10) {
            this.f15280a = d10;
        }

        public String toString() {
            return "Pricing{value=" + this.f15280a + ", currency='" + this.f15281b + "'}";
        }
    }

    public static class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f15282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15283b;

        public long getDuration() {
            return this.f15283b;
        }

        public boolean isSkippable() {
            return this.f15282a;
        }

        public String toString() {
            return "Video{skippable=" + this.f15282a + ", duration=" + this.f15283b + '}';
        }

        public Video(boolean z10, long j10) {
            this.f15282a = z10;
            this.f15283b = j10;
        }
    }

    public String getAdvertiserDomain() {
        return this.f15279i;
    }

    public String getCampaignId() {
        return this.f15278h;
    }

    public String getCountry() {
        return this.f15275e;
    }

    public String getCreativeId() {
        return this.f15277g;
    }

    public Long getDemandId() {
        return this.f15274d;
    }

    public String getDemandSource() {
        return this.f15273c;
    }

    public String getImpressionId() {
        return this.f15276f;
    }

    public Pricing getPricing() {
        return this.f15271a;
    }

    public Video getVideo() {
        return this.f15272b;
    }

    public void setAdvertiserDomain(String str) {
        this.f15279i = str;
    }

    public void setCampaignId(String str) {
        this.f15278h = str;
    }

    public void setCountry(String str) {
        this.f15275e = str;
    }

    public void setCreativeId(String str) {
        this.f15277g = str;
    }

    public void setCurrency(String str) {
        this.f15271a.f15281b = str;
    }

    public void setDemandId(Long l10) {
        this.f15274d = l10;
    }

    public void setDemandSource(String str) {
        this.f15273c = str;
    }

    public void setDuration(long j10) {
        this.f15272b.f15283b = j10;
    }

    public void setImpressionId(String str) {
        this.f15276f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f15271a = pricing;
    }

    public void setVideo(Video video) {
        this.f15272b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f15271a + ", video=" + this.f15272b + ", demandSource='" + this.f15273c + "', country='" + this.f15275e + "', impressionId='" + this.f15276f + "', creativeId='" + this.f15277g + "', campaignId='" + this.f15278h + "', advertiserDomain='" + this.f15279i + "'}";
    }

    public void setCpmValue(String str) {
        double d10;
        try {
            d10 = Double.parseDouble(str);
        } catch (Exception unused) {
            d10 = 0.0d;
        }
        this.f15271a.f15280a = d10;
    }
}
