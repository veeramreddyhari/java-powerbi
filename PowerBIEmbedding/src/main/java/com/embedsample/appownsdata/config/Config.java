package com.embedsample.appownsdata.config;

/**
 * Configuration class
 */
public abstract class Config {
	
	// Set this to true, to show debug statements in console
	public static final boolean DEBUG = false;
	
	//	Two possible Authentication methods: 
	//	- For authentication with master user credential choose MasterUser as AuthenticationType.
	//	- For authentication with app secret choose ServicePrincipal as AuthenticationType.
	//	More details here: https://aka.ms/EmbedServicePrincipal
	public static final String authenticationType = "ServicePrincipal";
	
	//	Common configuration properties for both authentication types
	// Enter workspaceId / groupId
	public static final String groupId = "cf676bae-0a43-4f61-add5-7fb72eb843f0";

	// The id of the report to embed.
	public static final String reportId = "52b3d6d1-d565-48fb-ade8-47b7eeee2f58";

	// Enter Application Id / Client Id
	public static final String clientId = "360d4873-a2d0-4108-adcf-436ff6657ba1";

	// Enter MasterUser credentials
	public static final String pbiUsername = "amrutha.dasaradi@eappsys.com";
	public static final String pbiPassword = "Proposal2309";

	// Enter ServicePrincipal credentials
	public static final String tenantId = "23a01f0b-a9c6-4ce2-a8ea-c6e94200257e";
	//public static final String appSecret = "7z1wvnlOFbbSBu029/k/UbV821BJeJ+Z1cOsxsdNbTk=";
	public static final String appSecret = "bB6pAw4vdMNiGzA3/OgSgDDiDRdM--3.";
		
	//	DO NOT CHANGE
	public static final String authorityUrl = "https://login.microsoftonline.com/";
	public static final String scopeUrl = "https://analysis.windows.net/powerbi/api/.default";
	
	
	private Config(){
		//Private Constructor will prevent the instantiation of this class directly
		throw new IllegalStateException("Config class");
	}
	
}