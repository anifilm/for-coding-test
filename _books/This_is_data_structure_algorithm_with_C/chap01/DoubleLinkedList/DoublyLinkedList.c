#include "DoublyLinkedList.h"

Node* DLL_CreateNode(ElementType NewData) {
    Node* NewNode = (Node*)malloc(sizeof(Node));

    NewNode->Data = NewData;
    NewNode->PrevNode = NULL;
    NewNode->NextNode = NULL;

    return NewNode;
}

void DLL_DestroyNode(Node* Node) {
    free(Node);
}

void DLL_AppendNode(Node** Head, Node* NewNode) {
    // Head 노드가 NULL이라면 새로운 노드가 Head가 된다.
    if ((*Head) == NULL) {
        *Head = NewNode;
    }
    else {
        // Tail을 찾아 NewNode를 연결한다.
        Node* Tail = (*Head);
        while (Tail->NextNode != NULL) {
            Tail = Tail->NextNode;
        }

        Tail->NextNode = NewNode;
        NewNode->PrevNode = Tail;
    }
}

void DLL_InsertAfter(Node* Current, Node* NewNode) {
    NewNode->NextNode = Current->NextNode;
    NewNode->PrevNode = Current;

    if (Current->NextNode != NULL) {
        Current->NextNode->PrevNode = NewNode;
        Current->NextNode = NewNode;
    }
}

void DLL_RemoveNode(Node** Head, Node* Remove) {
    if (*Head == Remove) {
        *Head = Remove->NextNode;
        if ((*Head) != NULL) {
            (*Head)->PrevNode = NULL;
        }

        Remove->PrevNode = NULL;
        Remove->NextNode = NULL;
    }
    else {
        Node* Temp = Remove;

        if (Remove->PrevNode != NULL) {
            Remove->PrevNode->NextNode = Temp->NextNode;
        }
        if (Remove->NextNode != NULL) {
            Remove->NextNode->PrevNode = Temp->PrevNode;
        }

        Remove->PrevNode = NULL;
        Remove->NextNode = NULL;
    }
}

Node* DLL_GetNodeAt(Node* Head, int Location) {
    Node* Current = Head;

    while (Current != NULL && (--Location) >= 0) {
        Current = Current->NextNode;
    }

    return Current;
}

int DLL_GetNodeCount(Node* Head) {
    unsigned int Count = 0;
    Node* Current = Head;

    while (Current != NULL) {
        Current = Current->NextNode;
        Count++;
    }

    return Count;
}

void PrintNode(Node* Node) {
    if (Node->PrevNode == NULL) {
        printf("Prev: NULL");
    }
    else {
        printf("Prev: %d\n", Node->PrevNode->Data);
    }
    printf("Current: %d\n", Node->Data);

    if (Node->NextNode == NULL) {
        printf("Next: NULL\n");
    }
    else {
        printf("Next: %d\n", Node->NextNode->Data);
    }
}
