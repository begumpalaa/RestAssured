package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUsersResponse{

    @JsonProperty("first_login_time_in_millis")
    public Object firstLoginTimeInMillis;

    @JsonProperty("tenant_id")
    public Object tenantId;

    @JsonProperty("privileges")
    public Object privileges;

    @JsonProperty("preferred_locale")
    public Object preferredLocale;

    @JsonProperty("account_type")
    public String accountType;

    @JsonProperty("group_mask")
    public Object groupMask;

    @JsonProperty("onboarding_experience_completed")
    public Object onboardingExperienceCompleted;

    @JsonProperty("user_inherited_groups")
    public Object userInheritedGroups;

    @JsonProperty("creation_time_in_millis")
    public Object creationTimeInMillis;

    @JsonProperty("hidden")
    public Object hidden;

    @JsonProperty("current_org")
    public Object currentOrg;

    @JsonProperty("owner_id")
    public Object ownerId;

    @JsonProperty("deprecated")
    public Object deprecated;

    @JsonProperty("modification_time_in_millis")
    public Object modificationTimeInMillis;

    @JsonProperty("account_status")
    public Object accountStatus;

    @JsonProperty("home_liveboard")
    public Object homeLiveboard;

    @JsonProperty("favorite_metadata")
    public Object favoriteMetadata;

    @JsonProperty("expiration_time_in_millis")
    public Object expirationTimeInMillis;

    @JsonProperty("super_user")
    public Object superUser;

    @JsonProperty("id")
    public String id;

    @JsonProperty("system_user")
    public Object systemUser;

    @JsonProperty("incomplete_details")
    public Object incompleteDetails;

    @JsonProperty("extended_preferences")
    public Object extendedPreferences;

    @JsonProperty("email")
    public Object email;

    @JsonProperty("welcome_email_sent")
    public Object welcomeEmailSent;

    @JsonProperty("org_privileges")
    public Object orgPrivileges;

    @JsonProperty("visibility")
    public String visibility;

    @JsonProperty("display_name")
    public String displayName;

    @JsonProperty("parent_type")
    public Object parentType;

    @JsonProperty("notify_on_share")
    public Object notifyOnShare;

    @JsonProperty("tags")
    public Object tags;

    @JsonProperty("show_onboarding_experience")
    public Object showOnboardingExperience;

    @JsonProperty("is_first_login")
    public Object isFirstLogin;

    @JsonProperty("external")
    public Object external;

    @JsonProperty("deleted")
    public Object deleted;

    @JsonProperty("extended_properties")
    public Object extendedProperties;

    @JsonProperty("name")
    public String name;

    @JsonProperty("modifier_id")
    public Object modifierId;

    @JsonProperty("complete_detail")
    public Object completeDetail;

    @JsonProperty("orgs")
    public Object orgs;

    @JsonProperty("author_id")
    public Object authorId;

    @JsonProperty("can_change_password")
    public Object canChangePassword;

    @JsonProperty("user_groups")
    public Object userGroups;
}