package com.iBommaHDTVMoviesAppInfo.ibomma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.google.android.material.appbar.MaterialToolbar;


import java.util.ArrayList;
import java.util.List;


public class iibomma16_textlist extends AppCompatActivity {
    CardView t1, t2, t3, t4, t5, t6, t7, t8;

    ImageView Ad1, Ad2, Ad3, Ad4, Ad5, Ad6, t9, t10, t11, t12, t13, t14, t15, t16;
    CardView s1, s2, s3, s4, s5, s6, s7, s8;
    TextView A2, A3, A4, A6;
    FrameLayout A5;
    ScrollView SV1, SV2;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;

    private com.facebook.ads.AdView bannerAdContainer;
    LinearLayout adView1;
    FrameLayout nativeAdContainer;

    NativeAd nativeAd1;
    InterstitialAd interstitialAd;

    public String TAG = String.valueOf(getClass());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iibomma16_textlist);


        iibomma16_splesh.url_passing(iibomma16_textlist.this);
        iibomma16_splesh.url_passing1(iibomma16_textlist.this);


        loadfbNativeAd();
        showfbbanner();
        showfbbanner1();
        ShowFullAds();


        findViewById(R.id.fl_adplaceholder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iibomma16_splesh.url_passing(iibomma16_textlist.this);
                iibomma16_splesh.url_passing1(iibomma16_textlist.this);

            }
        });

        findViewById(R.id.fl_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iibomma16_splesh.url_passing(iibomma16_textlist.this);
                iibomma16_splesh.url_passing1(iibomma16_textlist.this);

            }
        });
        materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setNavigationIcon(R.drawable.iibomma16_ibaseline_arrow_back_24);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        s1 = findViewById(R.id.s_1);
        s1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text1);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        s2 = findViewById(R.id.s_2);
        s2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text2);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

        s3 = findViewById(R.id.s_3);
        s3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text3);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

        s4 = findViewById(R.id.s_4);
        s4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text4);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

        s5 = findViewById(R.id.s_5);
        s5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text5);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

        s6 = findViewById(R.id.s_6);
        s6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text6);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        s7 = findViewById(R.id.s_7);
        s7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text7);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });
        s8 = findViewById(R.id.s_8);
        s8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text8);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }
        });

        t1 = findViewById(R.id.c_1);
        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text9);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }


        });
        t2 = findViewById(R.id.c_2);
        t2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text10);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }


        });
        t3 = findViewById(R.id.c_3);
        t3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text11);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t4 = findViewById(R.id.c_4);
        t4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text12);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });

        t5 = findViewById(R.id.c_5);
        t5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text13);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });

        t6 = findViewById(R.id.c_6);
        t6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text14);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t7 = findViewById(R.id.c_7);
        t7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text15);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t8 = findViewById(R.id.c_8);
        t8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                String s = getString(R.string.text16);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });


////////////////////


        t9 = findViewById(R.id.ia);
        t9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text6);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });

        t10 = findViewById(R.id.ib);
        t10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text7);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t11 = findViewById(R.id.ic);
        t11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text7);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });

        t12 = findViewById(R.id.id);
        t12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text8);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t13 = findViewById(R.id.ie);
        t13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text8);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t14 = findViewById(R.id.i_f);
        t14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text8);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t15 = findViewById(R.id.ig);
        t15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text8);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
        t16 = findViewById(R.id.ih);
        t16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String s = getString(R.string.text8);
                Bundle basket = new Bundle();
                basket.putString("Detail", s);
                Intent a = new Intent(iibomma16_textlist.this, iibomma16_detail1.class);
                a.putExtras(basket);
                startActivity(a);
            }

        });
    }


    public void onBackPressed() {
        super.onBackPressed();
        iibomma16_splesh.url_passing(iibomma16_textlist.this);
        iibomma16_splesh.url_passing1(iibomma16_textlist.this);

        ShowFullAds();


    }


    public static void inflateAd(NativeAd nativeAd, View adView, final Context context) {
        MediaView nativeAdIcon = (MediaView) adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = (TextView) adView.findViewById(R.id.native_ad_title);
        TextView nativeAdBody = (TextView) adView.findViewById(R.id.native_ad_body);
        MediaView nativeAdMedia = (MediaView) adView.findViewById(R.id.native_ad_media);
        TextView sponsoredLabel = (TextView) adView.findViewById(R.id.native_ad_sponsored_label);

        nativeAdMedia.setListener(new MediaViewListener() {
            @Override
            public void onVolumeChange(MediaView mediaView, float volume) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: Volume " + volume);
            }

            @Override
            public void onPause(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: Paused");
            }

            @Override
            public void onPlay(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: Play");
            }

            @Override
            public void onFullscreenBackground(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: FullscreenBackground");
            }

            @Override
            public void onFullscreenForeground(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: FullscreenForeground");
            }

            @Override
            public void onExitFullscreen(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: ExitFullscreen");
            }

            @Override
            public void onEnterFullscreen(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: EnterFullscreen");
            }

            @Override
            public void onComplete(MediaView mediaView) {
                Log.e(iibomma16_detail1.class.toString(), "MediaViewEvent: Completed");
            }
        });

        TextView nativeAdSocialContext = (TextView) adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdCallToAction = (TextView) adView.findViewById(R.id.native_ad_call_to_action);
        LinearLayout L1 = (LinearLayout) adView.findViewById(R.id.L1);
        L1.setVisibility(View.VISIBLE);

        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

        List< View > clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdIcon);
        clickableViews.add(nativeAdMedia);
        clickableViews.add(nativeAdCallToAction);
        nativeAd.registerViewForInteraction(adView, nativeAdMedia, nativeAdIcon, clickableViews);

        NativeAdBase.NativeComponentTag.tagView(nativeAdIcon, NativeAdBase.NativeComponentTag.AD_ICON);
        NativeAdBase.NativeComponentTag.tagView(nativeAdTitle, NativeAdBase.NativeComponentTag.AD_TITLE);
        NativeAdBase.NativeComponentTag.tagView(nativeAdBody, NativeAdBase.NativeComponentTag.AD_BODY);
        NativeAdBase.NativeComponentTag.tagView(nativeAdSocialContext, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT);
        NativeAdBase.NativeComponentTag.tagView(nativeAdCallToAction, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION);
    }

    public void loadfbNativeAd() {

        Log.e(TAG, "fbnative5 " + getString(R.string.fbnative));
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.iibomma16_ad_layout, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), getString(R.string.fbnative));
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e("fbnative5==>", "onMediaDownloaded: ");

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                //  nativeAdContainer.setVisibility(View.GONE);
                Log.e("fbnative5==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbnative5==>", "onAdLoaded: ");
                if (nativeAd1 == null || nativeAd1 != ad) {

                    return;
                }
                ImageView Qreka;
                Qreka = findViewById(R.id.qreka);
                Qreka.setVisibility(View.GONE);
                inflateAd(nativeAd1, adView1, getApplicationContext());
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbnative5==>", "onAdClicked: ");


            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbnative5==>", "onLoggingImpression: ");

            }
        };

        nativeAd1.loadAd(
                nativeAd1.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


    }

    private void showfbbanner() {
        Log.e(TAG, "fbban5 " + getString(R.string.fbbanner));
        FrameLayout adViewContainer = findViewById(R.id.fl_b);
        bannerAdContainer = new com.facebook.ads.AdView(this, getString(R.string.fbbanner), com.facebook.ads.AdSize.BANNER_HEIGHT_90);
        adViewContainer.addView(bannerAdContainer);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e("fbban5==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbban5==>", "onAdLoaded: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbban5==>", "onAdClicked: ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbban5==>", "onLoggingImpression: ");
            }
        };

        bannerAdContainer.loadAd(
                bannerAdContainer.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    private void showfbbanner1() {
        Log.e(TAG, "fbban5 " + getString(R.string.fbbanner));
        FrameLayout adViewContainer = findViewById(R.id.fl_b1);
        bannerAdContainer = new com.facebook.ads.AdView(this, getString(R.string.fbbanner), com.facebook.ads.AdSize.BANNER_HEIGHT_90);
        adViewContainer.addView(bannerAdContainer);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e("fbban5==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbban5==>", "onAdLoaded: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbban5==>", "onAdClicked: ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbban5==>", "onLoggingImpression: ");
            }
        };

        bannerAdContainer.loadAd(
                bannerAdContainer.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    public void ShowFullAds() {
        Log.e(TAG, "fbfull5 " + getString(R.string.fbfull));
        try {
            if (iibomma16_splesh.interstitialAd1 != null && iibomma16_splesh.interstitialAd1.isAdLoaded())
                iibomma16_splesh.interstitialAd1.show();
            else {
                if (!iibomma16_splesh.interstitialAd1.isAdLoaded())
                    iibomma16_splesh.interstitialAd1.loadAd();

                interstitialAd = new InterstitialAd(this, getString(R.string.fbfull));
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {


                    @Override
                    public void onInterstitialDisplayed(Ad ad) {

                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "fbfull5 " + "Interstitial ad dismissed.");
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "fbfull5" + adError.getErrorMessage());

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        Log.d(TAG, "fbfull5 " + "Interstitial ad is loaded and ready to be diSplash_screenlayed!");
                        if (interstitialAd != null && interstitialAd.isAdLoaded())
                            interstitialAd.show();
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "fbfull5 " + "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "fbfull5 " + "Interstitial ad impression logged!");
                    }
                };

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






















