use socialMedia;

create table Users (
	UserName			varchar(20)		not null,
    Password			varchar(20)		not null,
    NumberOfFollowers	int				not null,
    NumberOfFollowing	int				not null,
    SecurityAnswer1		varchar(20),
    SecurityAnswer2		varchar(20),
    SecurityAnswer3		varchar(20),
    NumberOfPosts		int				default 0,
    LastPostId			int				default 0,
    Primary Key (UserName)
);

create table Follows (
	FollowerUserName	varchar(25)		not null,
    FollowingUserName	varchar(25)		not null,
    Primary Key (FollowerUserName, FollowingUserName),
    Foreign key (FollowerUserName)	references Users (UserName),
    foreign key (FollowingUserName) references Users (UserName)
);

create table PostsAndComments (
	CommentContent		varchar(20)		not null,
    CommentId			varchar(50)		not null,
    Likes				int				default 0,
    RepliedTo			varchar(50),
    NumberOfReplies		int 			default 0,
    UserName 			varchar(20)		not null,
    DatePosted			date			not null,
    primary key 		(CommentId)
);

create table Likes (
	UserName 		varchar(20)		not null,
    PostOrCommentId	varchar(50)		not null,
    foreign key		(Username)	references	users	(Username),
    foreign key		(PostOrCommentId)	references	PostsAndComments	(CommentId),
    primary key		(Username, PostOrCommentId)
);

create table Chats (
	ChatName		varchar(45)		not null,
    LastMessageId	int				default 0
);

alter table Chats
add primary key (ChatName);

create table Messages (
	ChatName		varchar(45)		not null,
    Username 		varchar(20)		not null,
    id				int				not null,
    Content			varchar(250)	not	null,
    RepliedTo		int				default -1,
    primary key (ChatName, id),
    foreignchatsfollowsfollows_ibfk_1 key (ChatName) references	Chats (ChatName),
    foreign key	(Username) references   Users (UserName)
);

select * from Users;