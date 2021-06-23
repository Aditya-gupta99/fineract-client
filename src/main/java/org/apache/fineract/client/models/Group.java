/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.4.0-453-g1ac2469-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.Client;
import org.apache.fineract.client.models.GroupLevel;
import org.apache.fineract.client.models.Office;
import org.apache.fineract.client.models.Staff;

/**
 * Group
 */

public class Group {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_OFFICE = "office";
  @SerializedName(SERIALIZED_NAME_OFFICE)
  private Office office;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private Staff staff;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private Group parent;

  public static final String SERIALIZED_NAME_GROUP_LEVEL = "groupLevel";
  @SerializedName(SERIALIZED_NAME_GROUP_LEVEL)
  private GroupLevel groupLevel;

  public static final String SERIALIZED_NAME_GROUP_MEMBERS = "groupMembers";
  @SerializedName(SERIALIZED_NAME_GROUP_MEMBERS)
  private List<Group> groupMembers = null;

  public static final String SERIALIZED_NAME_CLIENT_MEMBERS = "clientMembers";
  @SerializedName(SERIALIZED_NAME_CLIENT_MEMBERS)
  private List<Client> clientMembers = null;

  public static final String SERIALIZED_NAME_SUBMITTED_ON_DATE = "submittedOnDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ON_DATE)
  private LocalDate submittedOnDate;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_REQUIRES_AUTO_GENERATION = "accountNumberRequiresAutoGeneration";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_REQUIRES_AUTO_GENERATION)
  private Boolean accountNumberRequiresAutoGeneration;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Boolean group;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Boolean pending;

  public static final String SERIALIZED_NAME_NOT_ACTIVE = "notActive";
  @SerializedName(SERIALIZED_NAME_NOT_ACTIVE)
  private Boolean notActive;

  public static final String SERIALIZED_NAME_CENTER = "center";
  @SerializedName(SERIALIZED_NAME_CENTER)
  private Boolean center;

  public static final String SERIALIZED_NAME_ACTIVATION_LOCAL_DATE = "activationLocalDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_LOCAL_DATE)
  private LocalDate activationLocalDate;

  public static final String SERIALIZED_NAME_TRANSFER_IN_PROGRESS = "transferInProgress";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN_PROGRESS)
  private Boolean transferInProgress;

  public static final String SERIALIZED_NAME_TRANSFER_ON_HOLD = "transferOnHold";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ON_HOLD)
  private Boolean transferOnHold;

  public static final String SERIALIZED_NAME_NOT_PENDING = "notPending";
  @SerializedName(SERIALIZED_NAME_NOT_PENDING)
  private Boolean notPending;

  public static final String SERIALIZED_NAME_TRANSFER_IN_PROGRESS_OR_ON_HOLD = "transferInProgressOrOnHold";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN_PROGRESS_OR_ON_HOLD)
  private Boolean transferInProgressOrOnHold;

  public static final String SERIALIZED_NAME_CHILD_GROUP = "childGroup";
  @SerializedName(SERIALIZED_NAME_CHILD_GROUP)
  private Boolean childGroup;

  public static final String SERIALIZED_NAME_ACTIVE_CLIENT_MEMBERS = "activeClientMembers";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CLIENT_MEMBERS)
  private List<Client> activeClientMembers = null;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;


  public Group id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Group office(Office office) {
    
    this.office = office;
    return this;
  }

   /**
   * Get office
   * @return office
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Office getOffice() {
    return office;
  }


  public void setOffice(Office office) {
    this.office = office;
  }


  public Group staff(Staff staff) {
    
    this.staff = staff;
    return this;
  }

   /**
   * Get staff
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Staff getStaff() {
    return staff;
  }


  public void setStaff(Staff staff) {
    this.staff = staff;
  }


  public Group parent(Group parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Group getParent() {
    return parent;
  }


  public void setParent(Group parent) {
    this.parent = parent;
  }


  public Group groupLevel(GroupLevel groupLevel) {
    
    this.groupLevel = groupLevel;
    return this;
  }

   /**
   * Get groupLevel
   * @return groupLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupLevel getGroupLevel() {
    return groupLevel;
  }


  public void setGroupLevel(GroupLevel groupLevel) {
    this.groupLevel = groupLevel;
  }


  public Group groupMembers(List<Group> groupMembers) {
    
    this.groupMembers = groupMembers;
    return this;
  }

  public Group addGroupMembersItem(Group groupMembersItem) {
    if (this.groupMembers == null) {
      this.groupMembers = new ArrayList<>();
    }
    this.groupMembers.add(groupMembersItem);
    return this;
  }

   /**
   * Get groupMembers
   * @return groupMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Group> getGroupMembers() {
    return groupMembers;
  }


  public void setGroupMembers(List<Group> groupMembers) {
    this.groupMembers = groupMembers;
  }


  public Group clientMembers(List<Client> clientMembers) {
    
    this.clientMembers = clientMembers;
    return this;
  }

  public Group addClientMembersItem(Client clientMembersItem) {
    if (this.clientMembers == null) {
      this.clientMembers = new ArrayList<>();
    }
    this.clientMembers.add(clientMembersItem);
    return this;
  }

   /**
   * Get clientMembers
   * @return clientMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Client> getClientMembers() {
    return clientMembers;
  }


  public void setClientMembers(List<Client> clientMembers) {
    this.clientMembers = clientMembers;
  }


  public Group submittedOnDate(LocalDate submittedOnDate) {
    
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getSubmittedOnDate() {
    return submittedOnDate;
  }


  public void setSubmittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  public Group accountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
    
    this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
    return this;
  }

   /**
   * Get accountNumberRequiresAutoGeneration
   * @return accountNumberRequiresAutoGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAccountNumberRequiresAutoGeneration() {
    return accountNumberRequiresAutoGeneration;
  }


  public void setAccountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
    this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
  }


  public Group closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public Group active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Group group(Boolean group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGroup() {
    return group;
  }


  public void setGroup(Boolean group) {
    this.group = group;
  }


  public Group pending(Boolean pending) {
    
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPending() {
    return pending;
  }


  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public Group notActive(Boolean notActive) {
    
    this.notActive = notActive;
    return this;
  }

   /**
   * Get notActive
   * @return notActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotActive() {
    return notActive;
  }


  public void setNotActive(Boolean notActive) {
    this.notActive = notActive;
  }


  public Group center(Boolean center) {
    
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCenter() {
    return center;
  }


  public void setCenter(Boolean center) {
    this.center = center;
  }


  public Group activationLocalDate(LocalDate activationLocalDate) {
    
    this.activationLocalDate = activationLocalDate;
    return this;
  }

   /**
   * Get activationLocalDate
   * @return activationLocalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getActivationLocalDate() {
    return activationLocalDate;
  }


  public void setActivationLocalDate(LocalDate activationLocalDate) {
    this.activationLocalDate = activationLocalDate;
  }


  public Group transferInProgress(Boolean transferInProgress) {
    
    this.transferInProgress = transferInProgress;
    return this;
  }

   /**
   * Get transferInProgress
   * @return transferInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferInProgress() {
    return transferInProgress;
  }


  public void setTransferInProgress(Boolean transferInProgress) {
    this.transferInProgress = transferInProgress;
  }


  public Group transferOnHold(Boolean transferOnHold) {
    
    this.transferOnHold = transferOnHold;
    return this;
  }

   /**
   * Get transferOnHold
   * @return transferOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferOnHold() {
    return transferOnHold;
  }


  public void setTransferOnHold(Boolean transferOnHold) {
    this.transferOnHold = transferOnHold;
  }


  public Group notPending(Boolean notPending) {
    
    this.notPending = notPending;
    return this;
  }

   /**
   * Get notPending
   * @return notPending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotPending() {
    return notPending;
  }


  public void setNotPending(Boolean notPending) {
    this.notPending = notPending;
  }


  public Group transferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
    
    this.transferInProgressOrOnHold = transferInProgressOrOnHold;
    return this;
  }

   /**
   * Get transferInProgressOrOnHold
   * @return transferInProgressOrOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferInProgressOrOnHold() {
    return transferInProgressOrOnHold;
  }


  public void setTransferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
    this.transferInProgressOrOnHold = transferInProgressOrOnHold;
  }


  public Group childGroup(Boolean childGroup) {
    
    this.childGroup = childGroup;
    return this;
  }

   /**
   * Get childGroup
   * @return childGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getChildGroup() {
    return childGroup;
  }


  public void setChildGroup(Boolean childGroup) {
    this.childGroup = childGroup;
  }


  public Group activeClientMembers(List<Client> activeClientMembers) {
    
    this.activeClientMembers = activeClientMembers;
    return this;
  }

  public Group addActiveClientMembersItem(Client activeClientMembersItem) {
    if (this.activeClientMembers == null) {
      this.activeClientMembers = new ArrayList<>();
    }
    this.activeClientMembers.add(activeClientMembersItem);
    return this;
  }

   /**
   * Get activeClientMembers
   * @return activeClientMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Client> getActiveClientMembers() {
    return activeClientMembers;
  }


  public void setActiveClientMembers(List<Client> activeClientMembers) {
    this.activeClientMembers = activeClientMembers;
  }


  public Group _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.office, group.office) &&
        Objects.equals(this.staff, group.staff) &&
        Objects.equals(this.parent, group.parent) &&
        Objects.equals(this.groupLevel, group.groupLevel) &&
        Objects.equals(this.groupMembers, group.groupMembers) &&
        Objects.equals(this.clientMembers, group.clientMembers) &&
        Objects.equals(this.submittedOnDate, group.submittedOnDate) &&
        Objects.equals(this.accountNumberRequiresAutoGeneration, group.accountNumberRequiresAutoGeneration) &&
        Objects.equals(this.closed, group.closed) &&
        Objects.equals(this.active, group.active) &&
        Objects.equals(this.group, group.group) &&
        Objects.equals(this.pending, group.pending) &&
        Objects.equals(this.notActive, group.notActive) &&
        Objects.equals(this.center, group.center) &&
        Objects.equals(this.activationLocalDate, group.activationLocalDate) &&
        Objects.equals(this.transferInProgress, group.transferInProgress) &&
        Objects.equals(this.transferOnHold, group.transferOnHold) &&
        Objects.equals(this.notPending, group.notPending) &&
        Objects.equals(this.transferInProgressOrOnHold, group.transferInProgressOrOnHold) &&
        Objects.equals(this.childGroup, group.childGroup) &&
        Objects.equals(this.activeClientMembers, group.activeClientMembers) &&
        Objects.equals(this._new, group._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, office, staff, parent, groupLevel, groupMembers, clientMembers, submittedOnDate, accountNumberRequiresAutoGeneration, closed, active, group, pending, notActive, center, activationLocalDate, transferInProgress, transferOnHold, notPending, transferInProgressOrOnHold, childGroup, activeClientMembers, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    groupLevel: ").append(toIndentedString(groupLevel)).append("\n");
    sb.append("    groupMembers: ").append(toIndentedString(groupMembers)).append("\n");
    sb.append("    clientMembers: ").append(toIndentedString(clientMembers)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    accountNumberRequiresAutoGeneration: ").append(toIndentedString(accountNumberRequiresAutoGeneration)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    notActive: ").append(toIndentedString(notActive)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    activationLocalDate: ").append(toIndentedString(activationLocalDate)).append("\n");
    sb.append("    transferInProgress: ").append(toIndentedString(transferInProgress)).append("\n");
    sb.append("    transferOnHold: ").append(toIndentedString(transferOnHold)).append("\n");
    sb.append("    notPending: ").append(toIndentedString(notPending)).append("\n");
    sb.append("    transferInProgressOrOnHold: ").append(toIndentedString(transferInProgressOrOnHold)).append("\n");
    sb.append("    childGroup: ").append(toIndentedString(childGroup)).append("\n");
    sb.append("    activeClientMembers: ").append(toIndentedString(activeClientMembers)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

