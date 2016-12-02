package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import android.widget.ImageView;

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private ArrayList<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Picture #" + i);
            ImageView v1 = new ImageView(context);

            crime.setImage(v1);
            v1.setImageResource(context.getResources().getIdentifier("drawable/images" + (i%6), null, context.getPackageName()));

            mCrimes.add(crime);

        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
