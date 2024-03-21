package com.goormthonuniv.ownearth.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.goormthonuniv.ownearth.domain.enums.MissionCategory;
import com.goormthonuniv.ownearth.dto.response.ItemResponseDto.ItemIdCategory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberResponseDto {

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class SignUpMemberResponse {

    Long memberId;
    String email;
    String name;
    String earthName;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class LoginMemberResponse {

    Long memberId;
    String accessToken;
    String refreshToken;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class MonthlyMissionStatusResponse {

    Long memberId;
    String name;
    Integer completedMissionCount;
    Integer accumulatedPoint;
    Integer completionRate;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class CompletedMissionResponse {

    Long memberMissionId;
    String imageUrl;
    String missionContent;
    MissionCategory missionCategory;
    LocalDateTime completedAt;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class RequestFriendSuccessResponse {

    Long requestId;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class FriendRequestResponse {

    Long requestId;
    Long memberId;
    String name;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class GetEarthResponse {

    List<ItemIdCategory> usingItems;
    String earthName;
    Long createdAt;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class AcceptFriendResponse {

    Long memberId;
    Boolean isFriend;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class GetPointResponse {

    Integer point;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class SearchMemberResponse {

    Long memberId;
    String name;
    String earthName;
    Boolean isFriend;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class ToggleItemUsingResponse {

    Long itemId;
    Boolean isUsing;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor(access = AccessLevel.PROTECTED)
  public static class FriendEarthStatusResponse {
    List<LocalDate> completedTimes;
    List<Long> usedFriendItemId;
    Integer inventoryCount;
    String earthName;
    Integer point;
  }
}
