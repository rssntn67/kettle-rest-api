package it.arsinfo.api.kettle.rest.client;

import it.arsinfo.api.kettle.rest.client.model.KettleJobStatus;
import it.arsinfo.api.kettle.rest.client.model.KettleRunJob;



public interface KettleService {


    public KettleRunJob runJob();

    public KettleJobStatus jobStatus(KettleRunJob runjob);

}
