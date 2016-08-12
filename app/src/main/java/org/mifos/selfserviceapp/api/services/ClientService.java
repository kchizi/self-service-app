package org.mifos.selfserviceapp.api.services;

import org.mifos.selfserviceapp.api.ApiEndPoints;
import org.mifos.selfserviceapp.data.Client;
import org.mifos.selfserviceapp.data.accounts.AccountListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author Vishwajeet
 * @since 20/6/16.
 */
public interface ClientService {

    //This is a default call and Loads client from 0 to 200
    @GET(ApiEndPoints.CLIENTS)
    Call<Client> getAllClients();

    @GET(ApiEndPoints.CLIENTS + "/{clientId}/accounts?fields={accountType}")
    Call<AccountListResponse> getLoanAccountsList(@Path("clientId") int clientId, @Path("accountType") String accountType);

}
