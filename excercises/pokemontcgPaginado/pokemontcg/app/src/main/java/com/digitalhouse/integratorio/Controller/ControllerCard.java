package com.digitalhouse.integratorio.Controller;

import android.content.Context;
import android.widget.Toast;

import com.digitalhouse.integratorio.Model.DAO.DaoCardDatabase;
import com.digitalhouse.integratorio.Model.DAO.DaoCardInternet;
import com.digitalhouse.integratorio.Model.POJO.Card;
import com.digitalhouse.integratorio.Util.HTTPConnectionManager;
import com.digitalhouse.integratorio.Util.ResultListener;

import java.util.List;

/**
 * Created by digitalhouse on 14/06/17.
 */

public class ControllerCard {
    private static final Integer PAGE_SIZE = 10;

    private Boolean endPaging = false;
    private Integer page = 1;

    public Boolean isRequestPaginationEnded(){
        return endPaging;
    }

    public void getCardList(final Context context, final ResultListener<List<Card>> viewListener){
        if (HTTPConnectionManager.isNetworkingOnline(context)){
            DaoCardInternet daoCardInternet = new DaoCardInternet();
            daoCardInternet.getCardListFromInternet(new ResultListener<List<Card>>() {
                @Override
                public void finish(List<Card> resultado) {
                    checkList(context, resultado, true, viewListener);
                }
            }, page, PAGE_SIZE);
        } else {
            DaoCardDatabase daoCardDatabase = new DaoCardDatabase(context);
            List<Card> cardList = daoCardDatabase.getCardList(page, PAGE_SIZE);

            checkList(context, cardList, false, viewListener);
            Toast.makeText(context, cardList.toString(), Toast.LENGTH_LONG).show();
        }
    }

    private void checkList(Context context, List<Card> cardList, Boolean saveInDatabase, ResultListener<List<Card>> viewListener){
        if (cardList != null && cardList.size() > 0) {

            page++;

            if (saveInDatabase) {
                DaoCardDatabase daoCardDatabase = new DaoCardDatabase(context);
                daoCardDatabase.addCardList(cardList);
            }
            viewListener.finish(cardList);
        } else {
            endPaging = true;
        }
    }
}
