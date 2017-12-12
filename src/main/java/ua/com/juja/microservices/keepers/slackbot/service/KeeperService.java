package ua.com.juja.microservices.keepers.slackbot.service;

/**
 * @author Nikolay Horushko
 * @author Dmitriy Lyashenko
 * @author Ivan Shapovalov
 * @author Oleksii Skachkov
 */
public interface KeeperService {
    String sendKeeperAddRequest(String fromUserId, String text);

    String sendKeeperDeactivateRequest(String fromUserId, String text);

    String getKeeperDirections(String fromUserId, String text);

    String getMyDirections(String fromUserId);
}
