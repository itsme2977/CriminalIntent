package dunnihoo.andrew.criminalintent;

import java.util.UUID;

/**
 * Created by andrew on 4/9/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmId() {
        return mId;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();

    }
}
