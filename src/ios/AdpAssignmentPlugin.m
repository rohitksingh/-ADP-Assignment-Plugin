#import "AdpAssignmentPlugin.h"

@implementation AdpAssignmentPlugin

- (void)calculate:(CDVInvokedUrlCommand*)command
{
    NSString* input = [[command arguments] objectAtIndex:0];

    int x = input.intValue;

    x = x * 10;

    NSLog(@"%@", [NSString stringWithFormat: @"result=%d",x]);

    CDVPluginResult* result = [CDVPluginResult
                               resultWithStatus:CDVCommandStatus_OK
                               messageAsString:x];
    
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
